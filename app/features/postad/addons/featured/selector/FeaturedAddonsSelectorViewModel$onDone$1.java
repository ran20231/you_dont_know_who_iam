package com.forsale.app.features.postad.addons.featured.selector;

import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.features.postad.addons.addonsgroupitem.AddonsGroupItemViewModel;
import g00.p;
import java.util.Set;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: FeaturedAddonsSelectorViewModel.kt */
@d(c = "com.forsale.app.features.postad.addons.featured.selector.FeaturedAddonsSelectorViewModel$onDone$1", f = "FeaturedAddonsSelectorViewModel.kt", l = {56}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class FeaturedAddonsSelectorViewModel$onDone$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f34780a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ FeaturedAddonsSelectorViewModel f34781b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FeaturedAddonsSelectorViewModel$onDone$1(FeaturedAddonsSelectorViewModel featuredAddonsSelectorViewModel, zz.a<? super FeaturedAddonsSelectorViewModel$onDone$1> aVar) {
        super(2, aVar);
        this.f34781b = featuredAddonsSelectorViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new FeaturedAddonsSelectorViewModel$onDone$1(this.f34781b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        MutableSharedFlow mutableSharedFlow;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f34780a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            mutableSharedFlow = this.f34781b.f34765s0;
            AddonsGroupItemViewModel value = this.f34781b.z0().getValue();
            o.f(value);
            Set<Addon> c11 = value.c();
            this.f34780a = 1;
            if (mutableSharedFlow.emit(c11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((FeaturedAddonsSelectorViewModel$onDone$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
