package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import com.forsale.app.datalayer.repositories.FiltersRepository;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LocationFilterViewModel.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel$deleteRecentLocation$1", f = "LocationFilterViewModel.kt", l = {189}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class LocationFilterViewModel$deleteRecentLocation$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29872a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocationFilterViewModel f29873b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ LocationTreeNode f29874c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterViewModel$deleteRecentLocation$1(LocationFilterViewModel locationFilterViewModel, LocationTreeNode locationTreeNode, zz.a<? super LocationFilterViewModel$deleteRecentLocation$1> aVar) {
        super(2, aVar);
        this.f29873b = locationFilterViewModel;
        this.f29874c = locationTreeNode;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new LocationFilterViewModel$deleteRecentLocation$1(this.f29873b, this.f29874c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        FiltersRepository filtersRepository;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29872a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            filtersRepository = this.f29873b.f29825l0;
            int e11 = this.f29874c.i().e();
            this.f29872a = 1;
            if (filtersRepository.deleteRecentLocation(e11, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((LocationFilterViewModel$deleteRecentLocation$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
