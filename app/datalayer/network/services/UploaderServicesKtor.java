package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.ResponseWrapperKtor;
import com.forsale.app.datalayer.network.responses.ImagesAndOneVideoUploadResponse;
import g00.l;
import java.util.List;
import wz.p;
import zz.a;
/* compiled from: UploaderServicesKtor.kt */
/* loaded from: classes2.dex */
public interface UploaderServicesKtor {
    Object uploadImagesAndOneVideoAsync(String str, List<String> list, String str2, l<? super Integer, p> lVar, a<? super ResponseWrapperKtor<ImagesAndOneVideoUploadResponse>> aVar);
}
