package com.forsale.app.features.categories.home.propertyhome;

import com.forsale.app.features.categories.home.propertyhome.models.SectionState;
import g00.p;
import java.util.List;
import kotlin.collections.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
/* compiled from: PropertyHomeViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.home.propertyhome.PropertyHomeViewModel$shuffleForSaleReality$1", f = "PropertyHomeViewModel.kt", l = {245}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PropertyHomeViewModel$shuffleForSaleReality$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f24855a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ PropertyHomeViewModel f24856b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PropertyHomeViewModel$shuffleForSaleReality$1(PropertyHomeViewModel propertyHomeViewModel, zz.a<? super PropertyHomeViewModel$shuffleForSaleReality$1> aVar) {
        super(2, aVar);
        this.f24856b = propertyHomeViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new PropertyHomeViewModel$shuffleForSaleReality$1(this.f24856b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        List f12;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f24855a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SectionState value = this.f24856b.x().getValue();
            if (value instanceof SectionState.f) {
                MutableStateFlow<SectionState> x11 = this.f24856b.x();
                SectionState.f fVar = (SectionState.f) value;
                SectionState.e b11 = fVar.b();
                f12 = q.f(fVar.b().d());
                SectionState.f fVar2 = new SectionState.f(SectionState.e.b(b11, f12, null, null, null, 14, null));
                this.f24855a = 1;
                if (x11.emit(fVar2, this) == f11) {
                    return f11;
                }
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((PropertyHomeViewModel$shuffleForSaleReality$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
