package com.programming.techie.javasftpserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaSftpserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSftpserverApplication.class, args);
		while(true) {
			try {
				Thread.sleep(10000);
				System.out.println("Sleeping 10 sec more");
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}

}
