package com.forsale.app.features.postad.addons.calculatorNew;

import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.e;
import com.forsale.app.utils.analytics.PaymentMethod;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PublishAdvViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.calculatorNew.PublishAdvViewModel$savePaymentMethod$1", f = "PublishAdvViewModel.kt", l = {424, 425}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class PublishAdvViewModel$savePaymentMethod$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34662a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PublishAdvViewModel f34663b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublishAdvViewModel$savePaymentMethod$1(PublishAdvViewModel publishAdvViewModel, zz.a<? super PublishAdvViewModel$savePaymentMethod$1> aVar) {
        super(2, aVar);
        this.f34663b = publishAdvViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PublishAdvViewModel$savePaymentMethod$1(this.f34663b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableStateFlow mutableStateFlow;
        e eVar;
        PostAdViewModel postAdViewModel;
        MutableStateFlow mutableStateFlow2;
        e eVar2;
        PostAdViewModel postAdViewModel2;
        f11 = b.f();
        int i11 = this.f34662a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f.b(obj);
        } else {
            f.b(obj);
            mutableStateFlow = this.f34663b.f34617w;
            eVar = this.f34663b.f34601g;
            postAdViewModel = this.f34663b.f34595a;
            PaymentMethod b11 = eVar.b(postAdViewModel.a2().getValue());
            this.f34662a = 1;
            if (mutableStateFlow.emit(b11, this) == f11) {
                return f11;
            }
        }
        mutableStateFlow2 = this.f34663b.f34618x;
        eVar2 = this.f34663b.f34601g;
        postAdViewModel2 = this.f34663b.f34595a;
        PaymentMethod a11 = eVar2.a(postAdViewModel2.J2().getValue());
        this.f34662a = 2;
        if (mutableStateFlow2.emit(a11, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PublishAdvViewModel$savePaymentMethod$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
