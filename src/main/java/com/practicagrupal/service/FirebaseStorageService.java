package com.practicagrupal.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    final String BucketName = "practicagrupal-645c3.appspot.com";

    final String rutaSuperiorStorage = "practicagrupal";

    final String rutaJsonFile = "firebase";
    
    final String archivoJsonFile = "practicagrupal-645c3-firebase-adminsdk-60ma3-319e5483e9.json";
}