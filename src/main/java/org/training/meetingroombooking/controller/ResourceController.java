package org.training.meetingroombooking.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.training.meetingroombooking.dto.ResourceDTO;
import org.training.meetingroombooking.service.ResourceService;

import java.util.List;

@RestController
@RequestMapping("/api/resources") // Base URL
public class ResourceController {

    private final ResourceService resourceService;

    public ResourceController(ResourceService resourceService) {
        this.resourceService = resourceService;
    }

    // ✅ API lấy danh sách tất cả resources
    @GetMapping
    public ResponseEntity<List<ResourceDTO>> getAllResources() {
        return ResponseEntity.ok(resourceService.getAllResources());
    }

    // ✅ API lấy resource theo ID
    @GetMapping("/{id}")
    public ResponseEntity<ResourceDTO> getResourceById(@PathVariable int id) {
        return ResponseEntity.ok(resourceService.getResourceById(id));
    }

    // ✅ API cập nhật resource
    @PutMapping("/{id}")
    public ResponseEntity<ResourceDTO> updateResource(
            @PathVariable int id,
            @RequestBody ResourceDTO resourceDTO) {
        return ResponseEntity.ok(resourceService.updateResource(id, resourceDTO));
    }
}
