package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import g00.p;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* compiled from: FilePreview.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$getFileMetaDAta$2", f = "FilePreview.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class FilePreviewKt$getFileMetaDAta$2 extends SuspendLambda implements p<CoroutineScope, a<? super URLConnection>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26909a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributesMapper.AttributesDataModel f26910b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Ref$ObjectRef<FileMetaData.FileType> f26911c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Ref$FloatRef f26912d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePreviewKt$getFileMetaDAta$2(AttributesMapper.AttributesDataModel attributesDataModel, Ref$ObjectRef<FileMetaData.FileType> ref$ObjectRef, Ref$FloatRef ref$FloatRef, a<? super FilePreviewKt$getFileMetaDAta$2> aVar) {
        super(2, aVar);
        this.f26910b = attributesDataModel;
        this.f26911c = ref$ObjectRef;
        this.f26912d = ref$FloatRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FilePreviewKt$getFileMetaDAta$2(this.f26910b, this.f26911c, this.f26912d, aVar);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.forsale.app.features.categories.listingdetails.buyerscreen.views.FileMetaData$FileType, T] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        b.f();
        if (this.f26909a == 0) {
            f.b(obj);
            URLConnection uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(new URL(this.f26910b.c()).openConnection());
            Ref$ObjectRef<FileMetaData.FileType> ref$ObjectRef = this.f26911c;
            Ref$FloatRef ref$FloatRef = this.f26912d;
            FileMetaData.FileType.a aVar = FileMetaData.FileType.Companion;
            String contentType = uRLConnection.getContentType();
            o.h(contentType, "getContentType(...)");
            ref$ObjectRef.f61778a = aVar.a(contentType);
            ref$FloatRef.f61775a = uRLConnection.getContentLength();
            return uRLConnection;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super URLConnection> aVar) {
        return ((FilePreviewKt$getFileMetaDAta$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
