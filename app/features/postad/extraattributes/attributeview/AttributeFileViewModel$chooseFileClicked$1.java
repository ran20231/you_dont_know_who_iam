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
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeFileViewModel$chooseFileClicked$1", f = "AttributeFileViewModel.kt", l = {53}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeFileViewModel$chooseFileClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f35395a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeFileViewModel f35396b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeFileViewModel$chooseFileClicked$1(AttributeFileViewModel attributeFileViewModel, zz.a<? super AttributeFileViewModel$chooseFileClicked$1> aVar) {
        super(2, aVar);
        this.f35396b = attributeFileViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeFileViewModel$chooseFileClicked$1(this.f35396b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = b.f();
        int i11 = this.f35395a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            x10.a.b("PLF-Attributes::chooseFileClicked launch", new Object[0]);
            mutableSharedFlow = this.f35396b.f35385j;
            wz.p pVar = wz.p.f75480a;
            this.f35395a = 1;
            if (mutableSharedFlow.emit(pVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeFileViewModel$chooseFileClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
