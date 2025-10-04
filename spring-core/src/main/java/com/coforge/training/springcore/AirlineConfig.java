package com.coforge.training.springcore;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Author	:Shozaib.Zulfiqar
 * Date		:Sep 26, 2025
 * Time 	:4:49:00 PM
 * Project 	:
 * Configuration class for Annotation Config and Component Scan 
 * to scan the components in the specified package
 */

@Configuration
@ComponentScan(basePackages = "com.coforge.training.springcore")
public class AirlineConfig {

}
