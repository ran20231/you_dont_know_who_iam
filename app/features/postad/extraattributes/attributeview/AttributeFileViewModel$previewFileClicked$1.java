package com.forsale.app.features.postad.extraattributes.attributeview;

import com.forsale.app.utils.TypeExtensionsKt;
import g00.p;
import java.io.File;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeFileViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFileViewModel$previewFileClicked$1", f = "AttributeFileViewModel.kt", l = {68, 69, 70}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeFileViewModel$previewFileClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35397a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeFileViewModel f35398b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeFileViewModel$previewFileClicked$1(AttributeFileViewModel attributeFileViewModel, zz.a<? super AttributeFileViewModel$previewFileClicked$1> aVar) {
        super(2, aVar);
        this.f35398b = attributeFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeFileViewModel$previewFileClicked$1(this.f35398b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        String fileName;
        boolean n11;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        MutableSharedFlow mutableSharedFlow3;
        f11 = b.f();
        int i11 = this.f35397a;
        if (i11 != 0) {
            if (i11 != 1 && i11 != 2 && i11 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            File value = this.f35398b.t().getValue();
            if (value == null || (fileName = value.getAbsolutePath()) == null) {
                fileName = this.f35398b.i().getFileName();
            }
            if (fileName != null) {
                AttributeFileViewModel attributeFileViewModel = this.f35398b;
                n11 = attributeFileViewModel.n();
                if (n11) {
                    mutableSharedFlow3 = attributeFileViewModel.f35393r;
                    this.f35397a = 1;
                    if (mutableSharedFlow3.emit(fileName, this) == f11) {
                        return f11;
                    }
                } else if (TypeExtensionsKt.P(fileName)) {
                    mutableSharedFlow2 = attributeFileViewModel.f35389n;
                    this.f35397a = 2;
                    if (mutableSharedFlow2.emit(fileName, this) == f11) {
                        return f11;
                    }
                } else {
                    mutableSharedFlow = attributeFileViewModel.f35391p;
                    File value2 = attributeFileViewModel.t().getValue();
                    this.f35397a = 3;
                    if (mutableSharedFlow.emit(value2, this) == f11) {
                        return f11;
                    }
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeFileViewModel$previewFileClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
