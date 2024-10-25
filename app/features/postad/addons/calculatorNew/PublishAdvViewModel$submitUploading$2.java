package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.features.postad.PostAdViewModel;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$submitUploading$2", f = "PublishAdvViewModel.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PublishAdvViewModel$submitUploading$2 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34670a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34671b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$submitUploading$2(PublishAdvViewModel publishAdvViewModel, zz.a<? super PublishAdvViewModel$submitUploading$2> aVar) {
        super(2, aVar);
        this.f34671b = publishAdvViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$submitUploading$2(this.f34671b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        PostAdViewModel postAdViewModel;
        Object r02;
        f11 = b.f();
        int i11 = this.f34670a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            this.f34671b.K();
            postAdViewModel = this.f34671b.f34595a;
            postAdViewModel.I4();
            PublishAdvViewModel publishAdvViewModel = this.f34671b;
            this.f34670a = 1;
            r02 = publishAdvViewModel.r0(this);
            if (r02 == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$submitUploading$2) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
