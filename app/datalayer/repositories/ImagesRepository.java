package com.forsale.app.datalayer.repositories;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.g;
import g00.l;
import java.io.File;
import kotlin.jvm.internal.o;
import p7.Target;
import wz.p;
/* compiled from: ImagesRepository.kt */
/* loaded from: classes2.dex */
public final class ImagesRepository {
    public static final int $stable = 8;
    private final Context applicationContext;

    public ImagesRepository(Context applicationContext) {
        o.i(applicationContext, "applicationContext");
        this.applicationContext = applicationContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadImageBitmap$default(ImagesRepository imagesRepository, String str, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new l<Bitmap, p>() { // from class: com.forsale.app.datalayer.repositories.ImagesRepository$downloadImageBitmap$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(Bitmap bitmap) {
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(Bitmap bitmap) {
                    invoke2(bitmap);
                    return p.f75480a;
                }
            };
        }
        imagesRepository.downloadImageBitmap(str, lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void downloadImageFile$default(ImagesRepository imagesRepository, String str, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            lVar = new l<File, p>() { // from class: com.forsale.app.datalayer.repositories.ImagesRepository$downloadImageFile$1
                /* renamed from: invoke  reason: avoid collision after fix types in other method */
                public final void invoke2(File file) {
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ p invoke(File file) {
                    invoke2(file);
                    return p.f75480a;
                }
            };
        }
        imagesRepository.downloadImageFile(str, lVar);
    }

    public final void downloadImageBitmap(String imageUrl, final l<? super Bitmap, p> onBitmapReady) {
        o.i(imageUrl, "imageUrl");
        o.i(onBitmapReady, "onBitmapReady");
        Glide.u(this.applicationContext).c().K0(imageUrl).D0(new g<Bitmap>() { // from class: com.forsale.app.datalayer.repositories.ImagesRepository$downloadImageBitmap$2
            @Override // com.bumptech.glide.request.g
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<Bitmap> target, boolean z11) {
                onBitmapReady.invoke(null);
                return false;
            }

            @Override // com.bumptech.glide.request.g
            public boolean onResourceReady(Bitmap bitmap, Object obj, Target<Bitmap> target, DataSource dataSource, boolean z11) {
                onBitmapReady.invoke(bitmap);
                return true;
            }
        }).P0();
    }

    public final void downloadImageFile(String imageUrl, final l<? super File, p> onFileDownloaded) {
        o.i(imageUrl, "imageUrl");
        o.i(onFileDownloaded, "onFileDownloaded");
        Glide.u(this.applicationContext).n().K0(imageUrl).D0(new g<File>() { // from class: com.forsale.app.datalayer.repositories.ImagesRepository$downloadImageFile$2
            @Override // com.bumptech.glide.request.g
            public boolean onLoadFailed(GlideException glideException, Object obj, Target<File> target, boolean z11) {
                onFileDownloaded.invoke(null);
                return false;
            }

            @Override // com.bumptech.glide.request.g
            public boolean onResourceReady(File resource, Object obj, Target<File> target, DataSource dataSource, boolean z11) {
                o.i(resource, "resource");
                onFileDownloaded.invoke(resource);
                return false;
            }
        }).P0();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object preLoadImage(java.lang.String r5, zz.a<? super wz.p> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.forsale.app.datalayer.repositories.ImagesRepository$preLoadImage$1
            if (r0 == 0) goto L13
            r0 = r6
            com.forsale.app.datalayer.repositories.ImagesRepository$preLoadImage$1 r0 = (com.forsale.app.datalayer.repositories.ImagesRepository$preLoadImage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.forsale.app.datalayer.repositories.ImagesRepository$preLoadImage$1 r0 = new com.forsale.app.datalayer.repositories.ImagesRepository$preLoadImage$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            kotlin.f.b(r6)
            goto L5e
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.f.b(r6)
            r5.g$a r6 = new r5.g$a
            android.content.Context r2 = r4.applicationContext
            r6.<init>(r2)
            r5.g$a r6 = r6.b(r5)
            coil.request.CachePolicy r2 = coil.request.CachePolicy.DISABLED
            r5.g$a r6 = r6.g(r2)
            r5.g r6 = r6.a()
            android.content.Context r2 = r4.applicationContext
            coil.ImageLoader r2 = f5.a.a(r2)
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r2.c(r6, r0)
            if (r6 != r1) goto L5e
            return r1
        L5e:
            r5.h r6 = (r5.h) r6
            boolean r0 = r6 instanceof r5.n
            if (r0 == 0) goto L7c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "coil PreLoading Success: "
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            x10.a.b(r5, r6)
            goto L89
        L7c:
            boolean r5 = r6 instanceof r5.d
            if (r5 == 0) goto L89
            r5.d r6 = (r5.d) r6
            java.lang.Throwable r5 = r6.c()
            x10.a.c(r5)
        L89:
            wz.p r5 = wz.p.f75480a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.datalayer.repositories.ImagesRepository.preLoadImage(java.lang.String, zz.a):java.lang.Object");
    }
}
