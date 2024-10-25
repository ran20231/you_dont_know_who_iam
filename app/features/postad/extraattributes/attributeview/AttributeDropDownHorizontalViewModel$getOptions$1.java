package com.forsale.app.features.postad.extraattributes.attributeview;

import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import g00.p;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AttributeDropDownHorizontalViewModel.kt */
@d(c = "com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontalViewModel$getOptions$1", f = "AttributeDropDownHorizontalViewModel.kt", l = {32, 32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class AttributeDropDownHorizontalViewModel$getOptions$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    Object f35248a;

    /* renamed from: b  reason: collision with root package name */
    int f35249b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ AttributeDropDownHorizontalViewModel f35250c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ int f35251d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AttributeDropDownHorizontalViewModel$getOptions$1(AttributeDropDownHorizontalViewModel attributeDropDownHorizontalViewModel, int i11, zz.a<? super AttributeDropDownHorizontalViewModel$getOptions$1> aVar) {
        super(2, aVar);
        this.f35250c = attributeDropDownHorizontalViewModel;
        this.f35251d = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new AttributeDropDownHorizontalViewModel$getOptions$1(this.f35250c, this.f35251d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        ExtraAttributeOptionDao extraAttributeOptionDao;
        f11 = b.f();
        int i11 = this.f35249b;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    f.b(obj);
                    return wz.p.f75480a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mutableSharedFlow = (MutableSharedFlow) this.f35248a;
            f.b(obj);
        } else {
            f.b(obj);
            mutableSharedFlow = this.f35250c.f35245f;
            extraAttributeOptionDao = this.f35250c.f35241b;
            int i12 = this.f35251d;
            this.f35248a = mutableSharedFlow;
            this.f35249b = 1;
            obj = extraAttributeOptionDao.getExtraAttributeOptionsBuAttributeId(i12, this);
            if (obj == f11) {
                return f11;
            }
        }
        this.f35248a = null;
        this.f35249b = 2;
        if (mutableSharedFlow.emit(obj, this) == f11) {
            return f11;
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((AttributeDropDownHorizontalViewModel$getOptions$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
