package com.forsale.app.ui.bottomsheets.attributes;

import com.forsale.app.datalayer.database.ExtraAttributeOptionEntity;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import zz.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeOptionsViewModel.kt */
@d(c = "com.forsale.app.ui.bottomsheets.attributes.AttributeOptionsViewModel$setSelectedOption$1$1", f = "AttributeOptionsViewModel.kt", l = {41, 42}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class AttributeOptionsViewModel$setSelectedOption$1$1 extends SuspendLambda implements p<CoroutineScope, a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f38036a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AttributeOptionsViewModel f38037b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ExtraAttributeOptionEntity f38038c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeOptionsViewModel$setSelectedOption$1$1(AttributeOptionsViewModel attributeOptionsViewModel, ExtraAttributeOptionEntity extraAttributeOptionEntity, a<? super AttributeOptionsViewModel$setSelectedOption$1$1> aVar) {
        super(2, aVar);
        this.f38037b = attributeOptionsViewModel;
        this.f38038c = extraAttributeOptionEntity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final a<wz.p> create(Object obj, a<?> aVar) {
        return new AttributeOptionsViewModel$setSelectedOption$1$1(this.f38037b, this.f38038c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        MutableSharedFlow mutableSharedFlow2;
        f11 = b.f();
        int i11 = this.f38036a;
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
            mutableSharedFlow = this.f38037b.f38030g;
            ExtraAttributeOptionEntity extraAttributeOptionEntity = this.f38038c;
            this.f38036a = 1;
            if (mutableSharedFlow.emit(extraAttributeOptionEntity, this) == f11) {
                return f11;
            }
        }
        mutableSharedFlow2 = this.f38037b.f38028e;
        wz.p pVar = wz.p.f75480a;
        this.f38036a = 2;
        if (mutableSharedFlow2.emit(pVar, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, a<? super wz.p> aVar) {
        return ((AttributeOptionsViewModel$setSelectedOption$1$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
