package com.magpiebackend.magpiebackend.controller;

import com.magpiebackend.magpiebackend.Modal.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService
{
    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId)
    {
        return new CloudVendor("C1", "Vendor 1", "Address One", "xxxxx");
    }

}
