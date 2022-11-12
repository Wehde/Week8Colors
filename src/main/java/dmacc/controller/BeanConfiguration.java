/**
 * @author Kilian Wehde - kewehde
 * CIS175 - Fall 2022
 * Oct 20, 2022
 */
package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Palette;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Palette palette() {
		Palette bean = new Palette("GameBoy");
		String colors = "0f380f, 306230, 8bac0f, 9bbc0f";
		bean.setColors(colors);
		bean.setCount(4);
		return bean;
	}
}
