package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.responses.ImagesAndOneVideoUploadResponse;
import com.forsale.app.datalayer.network.responses.UploadFileAttributeResponse;
import com.forsale.app.datalayer.network.responses.UploadImageResponse;
import i10.l;
import i10.o;
import i10.q;
import java.util.List;
import okhttp3.MultipartBody;
import zz.a;
/* compiled from: UploaderServices.kt */
/* loaded from: classes2.dex */
public interface UploaderServices {
    @o("uploader_extra.php")
    @l
    Object uploadFileAttributeAsync(@q("device_id") String str, @q MultipartBody.Part part, a<? super UploadFileAttributeResponse> aVar);

    @o(UploaderServicesKtorImpl.UPLOADER_API_URL)
    @l
    Object uploadImagesAndOneVideoAsync(@q("device_id") String str, @q List<MultipartBody.Part> list, a<? super ImagesAndOneVideoUploadResponse> aVar);

    @o("profile_image_uploader.php")
    @l
    Object uploadProfileImageAsync(@q("device_id") String str, @q MultipartBody.Part part, a<? super UploadImageResponse> aVar);
}
