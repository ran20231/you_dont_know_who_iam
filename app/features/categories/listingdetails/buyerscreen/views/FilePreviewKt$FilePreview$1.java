package com.forsale.app.features.categories.listingdetails.buyerscreen.views;

import android.content.Context;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.listingattributes.AttributesMapper;
import g00.p;
import j0.k0;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FilePreview.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.views.FilePreviewKt$FilePreview$1", f = "FilePreview.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FilePreviewKt$FilePreview$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f26891a;

    /* renamed from: b  reason: collision with root package name */
    int f26892b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributesMapper.AttributesDataModel f26893c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ Context f26894d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ k0<FileMetaData> f26895e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePreviewKt$FilePreview$1(AttributesMapper.AttributesDataModel attributesDataModel, Context context, k0<FileMetaData> k0Var, a<? super FilePreviewKt$FilePreview$1> aVar) {
        super(2, aVar);
        this.f26893c = attributesDataModel;
        this.f26894d = context;
        this.f26895e = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new FilePreviewKt$FilePreview$1(this.f26893c, this.f26894d, this.f26895e, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        Object h11;
        k0<FileMetaData> k0Var;
        f11 = b.f();
        int i11 = this.f26892b;
        if (i11 != 0) {
            if (i11 == 1) {
                k0Var = (k0) this.f26891a;
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            k0<FileMetaData> k0Var2 = this.f26895e;
            AttributesMapper.AttributesDataModel attributesDataModel = this.f26893c;
            Context context = this.f26894d;
            this.f26891a = k0Var2;
            this.f26892b = 1;
            h11 = FilePreviewKt.h(attributesDataModel, context, this);
            if (h11 == f11) {
                return f11;
            }
            k0Var = k0Var2;
            obj = h11;
        }
        FilePreviewKt.c(k0Var, (FileMetaData) obj);
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((FilePreviewKt$FilePreview$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
