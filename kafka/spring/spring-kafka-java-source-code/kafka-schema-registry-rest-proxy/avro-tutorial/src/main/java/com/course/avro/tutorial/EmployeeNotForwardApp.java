package com.course.avro.tutorial;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import com.course.avro.data.EmployeeNotForwardV1;
import com.course.avro.data.EmployeeNotForwardV2;

public class EmployeeNotForwardApp {

	public static void main(String[] args) {
		var file = new File("employeeNotForwardV2.avro");
		writeUsingV2(file);
		System.out.println("");
		readUsingV1(file);
	}

	private static void writeUsingV2(File toFile) {
		var data = EmployeeNotForwardV2.newBuilder().setFirstName("Clark").build();
		var datumWriter = new SpecificDatumWriter<>(EmployeeNotForwardV2.class);

		try (var dataWriter = new DataFileWriter<>(datumWriter)) {
			dataWriter.create(data.getSchema(), toFile);
			dataWriter.append(data);

			System.out.println("Writing (v2)");
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readUsingV1(File fromFile) {
		var datumReader = new SpecificDatumReader<>(EmployeeNotForwardV1.class);

		System.out.println("Reading (v1)");
		try (var dataReader = new DataFileReader<>(fromFile, datumReader)) {
			dataReader.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
