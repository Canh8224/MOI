package org.training.meetingroombooking.service;

import org.springframework.stereotype.Service;
import org.training.meetingroombooking.dto.ResourceDTO;

import java.util.ArrayList;
import java.util.List;

@Service
public class ResourceService {

    // Danh sách giả lập thay cho database
    private final List<ResourceDTO> resourceList = new ArrayList<>();

    // Lấy tất cả resources
    public List<ResourceDTO> getAllResources() {
        return resourceList;
    }

    // Lấy resource theo ID
    public ResourceDTO getResourceById(int id) {
        return resourceList.stream()
                .filter(resource -> resource.getId() == id)
                .findFirst()
                .orElse(null); // Hoặc throw Exception nếu muốn
    }

    // Cập nhật resource
    public ResourceDTO updateResource(int id, ResourceDTO resourceDTO) {
        for (int i = 0; i < resourceList.size(); i++) {
            if (resourceList.get(i).getId() == id) {
                resourceList.set(i, resourceDTO);
                return resourceDTO;
            }
        }
        return null; // Hoặc throw Exception
    }
}
