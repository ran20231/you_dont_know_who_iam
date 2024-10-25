package com.forsale.app.features.postad.extraattributes.attributeview;

import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeFileViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFileViewModel$removeFileClicked$1", f = "AttributeFileViewModel.kt", l = {59}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeFileViewModel$removeFileClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35399a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeFileViewModel f35400b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeFileViewModel$removeFileClicked$1(AttributeFileViewModel attributeFileViewModel, zz.a<? super AttributeFileViewModel$removeFileClicked$1> aVar) {
        super(2, aVar);
        this.f35400b = attributeFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeFileViewModel$removeFileClicked$1(this.f35400b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f35399a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f35400b.f35387l;
            wz.p pVar = wz.p.f75480a;
            this.f35399a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeFileViewModel$removeFileClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
