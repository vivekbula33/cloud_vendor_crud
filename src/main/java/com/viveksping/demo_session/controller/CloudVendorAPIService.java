package com.viveksping.demo_session.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viveksping.demo_session.model.CloudVendorAPI;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {
	
	CloudVendorAPI cloudVendorAPI;
	
	@GetMapping("{vendorId}")
	public CloudVendorAPI getCloudVendorDetails(String vendorId)
	{
		
		return cloudVendorAPI;
		
		//return new CloudVendorAPI("C1","Vendor1","Address one","xxxxxxxx");
		
	}

	@PostMapping
	public  String createCloudVendorDetails(@RequestBody CloudVendorAPI cloudVendorAPI) {
		
		this.cloudVendorAPI= cloudVendorAPI;
		return "Cloud Vendor Create Successfully";
	}
	
	@PutMapping
    public  String updateCloudVendorDetails(@RequestBody CloudVendorAPI cloudVendorAPI) {
		
		this.cloudVendorAPI= cloudVendorAPI;
		return "Cloud Vendor updated Successfully";
	}
	
	@DeleteMapping("{vendorId}")
    public  String deleteCloudVendorDetails(String vendorId) {
		
		this.cloudVendorAPI= null;
		return "Cloud Vendor deleted Successfully";
	}
}
