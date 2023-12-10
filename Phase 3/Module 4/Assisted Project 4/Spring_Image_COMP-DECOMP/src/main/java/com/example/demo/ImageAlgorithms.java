package com.example.demo;

import java.io.ByteArrayOutputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class ImageAlgorithms {

	//compression -- util.zip.Deflater
	// take the data in bytes , compress it , write the data into the ByteArray
	public static byte[] compressImage(byte data[]) {
		Deflater deflater=new Deflater();
		deflater.setLevel(Deflater.BEST_COMPRESSION);
		deflater.setInput(data);
		deflater.finish();

		ByteArrayOutputStream out=new ByteArrayOutputStream(data.length);
		byte[] tmp=new byte[4*1024];
		while(!deflater.finished()) {
			int size=deflater.deflate(tmp);
			out.write(tmp,0,size);

		}
		return out.toByteArray();
	}





	//Decompression-- util.zip.Inflater
	//take the file , decompress it , read the data in ByteArray stream
	public static byte[] decompressImage(byte data[]) throws DataFormatException {
		Inflater inflater=new Inflater();
		inflater.setInput(data);
		ByteArrayOutputStream out=new ByteArrayOutputStream(data.length);
		byte[] tmp=new byte[4*1024];
		while(!inflater.finished()) {
			int size=inflater.inflate(tmp);
			out.write(tmp,0,size);

		}
		return out.toByteArray();
	}
}
