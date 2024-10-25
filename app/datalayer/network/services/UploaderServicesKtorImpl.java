package com.forsale.app.datalayer.network.services;

import com.forsale.app.datalayer.network.requestsbodies.GetListingsBaseBody;
import com.forsale.app.utils.TopLevelUtilityFunctionsKt;
import com.forsale.app.utils.TypeExtensionsKt;
import e00.h;
import g00.l;
import io.ktor.client.HttpClient;
import io.ktor.client.request.forms.FormDslKt;
import io.ktor.http.content.PartData;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jy.a;
import jy.b;
import kotlin.collections.r;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import my.j;
import my.k;
import my.m;
import okhttp3.MediaType;
import wz.p;
/* compiled from: UploaderServicesKtorImpl.kt */
/* loaded from: classes2.dex */
public final class UploaderServicesKtorImpl implements UploaderServicesKtor {
    public static final String UPLOADER_API_URL = "uploader_new.php";
    private final String baseUrl;
    private final HttpClient client;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: UploaderServicesKtorImpl.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public UploaderServicesKtorImpl(HttpClient client, String baseUrl) {
        o.i(client, "client");
        o.i(baseUrl, "baseUrl");
        this.client = client;
        this.baseUrl = baseUrl;
    }

    private final List<PartData> buildFormData(final String str, final List<String> list, final String str2) {
        return FormDslKt.a(new l<a, p>() { // from class: com.forsale.app.datalayer.network.services.UploaderServicesKtorImpl$buildFormData$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(a aVar) {
                invoke2(aVar);
                return p.f75480a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(a formData) {
                List<b> imagesFormPart;
                b videoFormPart;
                o.i(formData, "$this$formData");
                a.c(formData, GetListingsBaseBody.DEVICE_ID, str, null, 4, null);
                imagesFormPart = this.getImagesFormPart(list);
                if (imagesFormPart != null) {
                    for (b bVar : imagesFormPart) {
                        formData.b(bVar);
                    }
                }
                videoFormPart = this.getVideoFormPart(str2);
                if (videoFormPart != null) {
                    formData.b(videoFormPart);
                }
            }
        });
    }

    private final b<byte[]> createFileFormPart(String str, File file, MediaType mediaType, String str2) {
        byte[] c11;
        String type;
        c11 = h.c(file);
        j.a aVar = j.f63648a;
        k kVar = new k(0, 1, null);
        m mVar = m.f63651a;
        String h11 = mVar.h();
        if (mediaType != null && (type = mediaType.type()) != null) {
            str2 = type;
        }
        kVar.a(h11, str2);
        String f11 = mVar.f();
        String name = file.getName();
        o.h(name, "getName(...)");
        String k11 = TopLevelUtilityFunctionsKt.k(name);
        kVar.a(f11, "filename=" + k11);
        p pVar = p.f75480a;
        return new b<>(str, c11, kVar.q());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<b<byte[]>> getImagesFormPart(List<String> list) {
        int y11;
        if (list == null) {
            return null;
        }
        if (!(!list.isEmpty())) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!TypeExtensionsKt.P((String) obj)) {
                arrayList.add(obj);
            }
        }
        y11 = s.y(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(y11);
        int i11 = 0;
        for (Object obj2 : arrayList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                r.x();
            }
            File file = new File((String) obj2);
            arrayList2.add(createFileFormPart("image" + i11, file, com.forsale.app.utils.o.b(file, "image/*"), "image/png"));
            i11 = i12;
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getProgress(long j11, long j12) {
        return (int) ((j11 / j12) * 100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final b<byte[]> getVideoFormPart(String str) {
        boolean v11;
        if (str != null) {
            v11 = kotlin.text.s.v(str);
            boolean z11 = true;
            if (!((!(v11 ^ true) || TypeExtensionsKt.P(str)) ? false : false)) {
                str = null;
            }
            if (str == null) {
                return null;
            }
            File file = new File(str);
            return createFileFormPart("video", file, com.forsale.app.utils.o.b(file, "video/*"), "video/mp4");
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:51:0x010e, B:62:0x013c, B:63:0x0141, B:47:0x00e1), top: B:66:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0034, B:51:0x010e, B:62:0x013c, B:63:0x0141, B:47:0x00e1), top: B:66:0x0028 }] */
    @Override // com.forsale.app.datalayer.network.services.UploaderServicesKtor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object uploadImagesAndOneVideoAsync(java.lang.String r11, java.util.List<java.lang.String> r12, java.lang.String r13, g00.l<? super java.lang.Integer, wz.p> r14, zz.a<? super com.forsale.app.datalayer.network.ResponseWrapperKtor<com.forsale.app.datalayer.network.responses.ImagesAndOneVideoUploadResponse>> r15) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.network.services.UploaderServicesKtorImpl.uploadImagesAndOneVideoAsync(java.lang.String, java.util.List, java.lang.String, g00.l, zz.a):java.lang.Object");
    }
}
