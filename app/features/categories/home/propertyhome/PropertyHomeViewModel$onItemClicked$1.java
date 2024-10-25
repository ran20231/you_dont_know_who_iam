package com.forsale.app.features.categories.home.propertyhome;

import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$onItemClicked$1", f = "PropertyHomeViewModel.kt", l = {419}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PropertyHomeViewModel$onItemClicked$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24846a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24847b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ xa.a f24848c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$onItemClicked$1(PropertyHomeViewModel propertyHomeViewModel, xa.a aVar, zz.a<? super PropertyHomeViewModel$onItemClicked$1> aVar2) {
        super(2, aVar2);
        this.f24847b = propertyHomeViewModel;
        this.f24848c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PropertyHomeViewModel$onItemClicked$1(this.f24847b, this.f24848c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24846a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            MutableSharedFlow<xa.a> z11 = this.f24847b.z();
            xa.a aVar = this.f24848c;
            this.f24846a = 1;
            if (z11.emit(aVar, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PropertyHomeViewModel$onItemClicked$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
