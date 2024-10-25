package com.forsale.app.features.categories.listings.filtration.allFilters;

import android.os.Bundle;
import androidx.fragment.app.w;
import com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersViewModel;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import wz.p;
/* compiled from: AllFiltersDialogFragment.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$onViewCreated$2", f = "AllFiltersDialogFragment.kt", l = {66}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AllFiltersDialogFragment$onViewCreated$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f28991a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AllFiltersDialogFragment f28992b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AllFiltersDialogFragment.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$onViewCreated$2$1", f = "AllFiltersDialogFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.allFilters.AllFiltersDialogFragment$onViewCreated$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<AllFiltersViewModel.a, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f28993a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f28994b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ AllFiltersDialogFragment f28995c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AllFiltersDialogFragment allFiltersDialogFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f28995c = allFiltersDialogFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(AllFiltersViewModel.a aVar, zz.a<? super p> aVar2) {
            return ((AnonymousClass1) create(aVar, aVar2)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28995c, aVar);
            anonymousClass1.f28994b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f28993a == 0) {
                f.b(obj);
                AllFiltersViewModel.a aVar = (AllFiltersViewModel.a) this.f28994b;
                if (aVar instanceof AllFiltersViewModel.a.C0316a) {
                    AllFiltersDialogFragment allFiltersDialogFragment = this.f28995c;
                    Bundle bundle = new Bundle();
                    AllFiltersViewModel.a.C0316a c0316a = (AllFiltersViewModel.a.C0316a) aVar;
                    bundle.putParcelable("all_filters_changed_filters", c0316a.a());
                    bundle.putBoolean("is_all_filters_changed_filters", c0316a.b());
                    p pVar = p.f75480a;
                    w.b(allFiltersDialogFragment, "all_filters_request", bundle);
                    this.f28995c.dismiss();
                } else if (aVar instanceof AllFiltersViewModel.a.b) {
                    if (((AllFiltersViewModel.a.b) aVar).a()) {
                        AllFiltersDialogFragment allFiltersDialogFragment2 = this.f28995c;
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("is_all_filters_changed_filters", true);
                        p pVar2 = p.f75480a;
                        w.b(allFiltersDialogFragment2, "all_filters_request", bundle2);
                    }
                    this.f28995c.dismiss();
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AllFiltersDialogFragment$onViewCreated$2(AllFiltersDialogFragment allFiltersDialogFragment, zz.a<? super AllFiltersDialogFragment$onViewCreated$2> aVar) {
        super(1, aVar);
        this.f28992b = allFiltersDialogFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new AllFiltersDialogFragment$onViewCreated$2(this.f28992b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f28991a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            MutableSharedFlow<AllFiltersViewModel.a> D0 = this.f28992b.y().D0();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f28992b, null);
            this.f28991a = 1;
            if (FlowKt.collectLatest(D0, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((AllFiltersDialogFragment$onViewCreated$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
