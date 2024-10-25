package com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.a;
import com.forsale.app.features.categories.listings.filtration.fullFiltration.viewModels.baseViewModel.FilterViewModel;
import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.horizontalSheet.HorizontalFilterBottomSheet;
import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.locationSheet.LocationFilterDialog;
import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.rangeSheet.RangeFilterBottomSheet;
import com.forsale.app.features.categories.listings.filtration.fullscreenfilters.selectingSheet.SelectableFilterDialog;
import fc.c;
import g00.l;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: OpenFilterInNewScreenHandler.kt */
@d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt$observeFilterClicked$2", f = "OpenFilterInNewScreenHandler.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class OpenFilterInNewScreenHandlerKt$observeFilterClicked$2 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f29194a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ SharedFlow<Triple<FilterViewModel<?, ?, ?>, a, Integer>> f29195b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Fragment f29196c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ g00.p<com.forsale.app.utils.analytics.listingfiltration.a, Integer, p> f29197d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: OpenFilterInNewScreenHandler.kt */
    @d(c = "com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt$observeFilterClicked$2$1", f = "OpenFilterInNewScreenHandler.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt$observeFilterClicked$2$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Triple<? extends FilterViewModel<?, ?, ?>, ? extends a, ? extends Integer>, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f29198a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f29199b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f29200c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ g00.p<com.forsale.app.utils.analytics.listingfiltration.a, Integer, p> f29201d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Fragment fragment, g00.p<? super com.forsale.app.utils.analytics.listingfiltration.a, ? super Integer, p> pVar, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f29200c = fragment;
            this.f29201d = pVar;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(Triple<? extends FilterViewModel<?, ?, ?>, ? extends a, Integer> triple, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(triple, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29200c, this.f29201d, aVar);
            anonymousClass1.f29199b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            b.f();
            if (this.f29198a == 0) {
                f.b(obj);
                final Triple triple = (Triple) this.f29199b;
                a aVar = (a) triple.e();
                if (aVar instanceof a.AbstractC0319a.b) {
                    SelectableFilterDialog.a aVar2 = SelectableFilterDialog.f29953j;
                    FragmentManager childFragmentManager = this.f29200c.getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    final g00.p<com.forsale.app.utils.analytics.listingfiltration.a, Integer, p> pVar = this.f29201d;
                    aVar2.a(childFragmentManager, (a.AbstractC0319a.b) aVar, new l<c, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt.observeFilterClicked.2.1.1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void b(c selectedData) {
                            o.i(selectedData, "selectedData");
                            com.forsale.app.utils.analytics.listingfiltration.a a11 = selectedData.a();
                            if (a11 != null) {
                                pVar.invoke(a11, triple.f());
                            }
                            triple.d().a0(selectedData);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(c cVar) {
                            b(cVar);
                            return p.f75480a;
                        }
                    });
                } else if (aVar instanceof a.AbstractC0319a.C0320a) {
                    HorizontalFilterBottomSheet.a aVar3 = HorizontalFilterBottomSheet.f29635x;
                    FragmentManager childFragmentManager2 = this.f29200c.getChildFragmentManager();
                    o.h(childFragmentManager2, "getChildFragmentManager(...)");
                    final g00.p<com.forsale.app.utils.analytics.listingfiltration.a, Integer, p> pVar2 = this.f29201d;
                    aVar3.a(childFragmentManager2, (a.AbstractC0319a.C0320a) aVar, new l<c, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt.observeFilterClicked.2.1.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void b(c selectedData) {
                            o.i(selectedData, "selectedData");
                            com.forsale.app.utils.analytics.listingfiltration.a a11 = selectedData.a();
                            if (a11 != null) {
                                pVar2.invoke(a11, triple.f());
                            }
                            triple.d().a0(selectedData);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(c cVar) {
                            b(cVar);
                            return p.f75480a;
                        }
                    });
                } else if (aVar instanceof a.b) {
                    LocationFilterDialog.a aVar4 = LocationFilterDialog.f29794j;
                    FragmentManager childFragmentManager3 = this.f29200c.getChildFragmentManager();
                    o.h(childFragmentManager3, "getChildFragmentManager(...)");
                    final g00.p<com.forsale.app.utils.analytics.listingfiltration.a, Integer, p> pVar3 = this.f29201d;
                    aVar4.a(childFragmentManager3, (a.b) aVar, new l<c, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt.observeFilterClicked.2.1.3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void b(c selectedData) {
                            o.i(selectedData, "selectedData");
                            com.forsale.app.utils.analytics.listingfiltration.a a11 = selectedData.a();
                            if (a11 != null) {
                                pVar3.invoke(a11, triple.f());
                            }
                            triple.d().a0(selectedData);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(c cVar) {
                            b(cVar);
                            return p.f75480a;
                        }
                    });
                } else if (aVar instanceof a.c) {
                    RangeFilterBottomSheet.a aVar5 = RangeFilterBottomSheet.f29900x;
                    FragmentManager childFragmentManager4 = this.f29200c.getChildFragmentManager();
                    o.h(childFragmentManager4, "getChildFragmentManager(...)");
                    final g00.p<com.forsale.app.utils.analytics.listingfiltration.a, Integer, p> pVar4 = this.f29201d;
                    aVar5.a(childFragmentManager4, (a.c) aVar, new l<c, p>() { // from class: com.forsale.app.features.categories.listings.filtration.fullFiltration.clickableFilters.OpenFilterInNewScreenHandlerKt.observeFilterClicked.2.1.4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }

                        public final void b(c result) {
                            o.i(result, "result");
                            com.forsale.app.utils.analytics.listingfiltration.a a11 = result.a();
                            if (a11 != null) {
                                pVar4.invoke(a11, triple.f());
                            }
                            triple.d().a0(result);
                        }

                        @Override // g00.l
                        public /* bridge */ /* synthetic */ p invoke(c cVar) {
                            b(cVar);
                            return p.f75480a;
                        }
                    });
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public OpenFilterInNewScreenHandlerKt$observeFilterClicked$2(SharedFlow<? extends Triple<? extends FilterViewModel<?, ?, ?>, ? extends a, Integer>> sharedFlow, Fragment fragment, g00.p<? super com.forsale.app.utils.analytics.listingfiltration.a, ? super Integer, p> pVar, zz.a<? super OpenFilterInNewScreenHandlerKt$observeFilterClicked$2> aVar) {
        super(1, aVar);
        this.f29195b = sharedFlow;
        this.f29196c = fragment;
        this.f29197d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new OpenFilterInNewScreenHandlerKt$observeFilterClicked$2(this.f29195b, this.f29196c, this.f29197d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = b.f();
        int i11 = this.f29194a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Triple<FilterViewModel<?, ?, ?>, a, Integer>> sharedFlow = this.f29195b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29196c, this.f29197d, null);
            this.f29194a = 1;
            if (FlowKt.collectLatest(sharedFlow, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((OpenFilterInNewScreenHandlerKt$observeFilterClicked$2) create(aVar)).invokeSuspend(p.f75480a);
    }
}
