package com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet;

import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wz.p;
/* compiled from: LocationFilterDialog.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$onViewCreated$1", f = "LocationFilterDialog.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LocationFilterDialog$onViewCreated$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29819a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ LocationFilterDialog f29820b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocationFilterDialog.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$onViewCreated$1$1", f = "LocationFilterDialog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog$onViewCreated$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<LocationFilterViewModel.a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f29821a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f29822b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ LocationFilterDialog f29823c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LocationFilterDialog locationFilterDialog, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f29823c = locationFilterDialog;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(LocationFilterViewModel.a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29823c, aVar);
            anonymousClass1.f29822b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            l lVar;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f29821a == 0) {
                f.b(obj);
                LocationFilterViewModel.a aVar = (LocationFilterViewModel.a) this.f29822b;
                if (aVar instanceof LocationFilterViewModel.a.C0331a) {
                    lVar = this.f29823c.f29796f;
                    if (lVar != null) {
                        lVar.invoke(((LocationFilterViewModel.a.C0331a) aVar).a());
                    }
                    this.f29823c.dismiss();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationFilterDialog$onViewCreated$1(LocationFilterDialog locationFilterDialog, zz.a<? super LocationFilterDialog$onViewCreated$1> aVar) {
        super(1, aVar);
        this.f29820b = locationFilterDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new LocationFilterDialog$onViewCreated$1(this.f29820b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        LocationFilterViewModel C;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f29819a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            C = this.f29820b.C();
            MutableSharedFlow<LocationFilterViewModel.a> I0 = C.I0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29820b, null);
            this.f29819a = 1;
            if (FlowKt.collectLatest(I0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((LocationFilterDialog$onViewCreated$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
