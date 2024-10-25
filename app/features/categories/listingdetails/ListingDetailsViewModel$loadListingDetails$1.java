package com.forsale.app.features.categories.listingdetails;

import androidx.lifecycle.r0;
import com.forsale.app.base.ViewStates;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import t9.y0;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingDetailsViewModel.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$loadListingDetails$1", f = "ListingDetailsViewModel.kt", l = {114}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingDetailsViewModel$loadListingDetails$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f25385a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingDetailsViewModel f25386b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListingDetailsViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$loadListingDetails$1$1", f = "ListingDetailsViewModel.kt", l = {116}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$loadListingDetails$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Boolean, zz.a<? super wz.p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f25387a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ boolean f25388b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ListingDetailsViewModel f25389c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ListingDetailsViewModel listingDetailsViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f25389c = listingDetailsViewModel;
        }

        public final Object b(boolean z11, zz.a<? super wz.p> aVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), aVar)).invokeSuspend(wz.p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25389c, aVar);
            anonymousClass1.f25388b = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.a<? super wz.p> aVar) {
            return b(bool.booleanValue(), aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object f11;
            f11 = kotlin.coroutines.intrinsics.b.f();
            int i11 = this.f25387a;
            if (i11 != 0) {
                if (i11 == 1) {
                    kotlin.f.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                kotlin.f.b(obj);
                if (!this.f25388b) {
                    return wz.p.f75480a;
                }
                ListingDetailsRepository j12 = this.f25389c.j1();
                final ListingDetailsViewModel listingDetailsViewModel = this.f25389c;
                g00.a<wz.p> aVar = new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel.loadListingDetails.1.1.1
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        ListingDetailsViewModel.this.w1().postValue(ViewStates.LOADING);
                    }
                };
                final ListingDetailsViewModel listingDetailsViewModel2 = this.f25389c;
                l<Boolean, wz.p> lVar = new l<Boolean, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel.loadListingDetails.1.1.2
                    {
                        super(1);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ wz.p invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return wz.p.f75480a;
                    }

                    public final void invoke(boolean z11) {
                        ListingDetailsViewModel.this.w1().postValue(ViewStates.CONTENT);
                        ListingDetailsViewModel.this.T1();
                        ListingDetailsViewModel.this.X1(z11);
                    }
                };
                final ListingDetailsViewModel listingDetailsViewModel3 = this.f25389c;
                g00.a<wz.p> aVar2 = new g00.a<wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel.loadListingDetails.1.1.3

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: ListingDetailsViewModel.kt */
                    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$loadListingDetails$1$1$3$1", f = "ListingDetailsViewModel.kt", l = {124}, m = "invokeSuspend")
                    /* renamed from: com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel$loadListingDetails$1$1$3$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public static final class C02751 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

                        /* renamed from: a  reason: collision with root package name */
                        int f25393a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ ListingDetailsViewModel f25394b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C02751(ListingDetailsViewModel listingDetailsViewModel, zz.a<? super C02751> aVar) {
                            super(2, aVar);
                            this.f25394b = listingDetailsViewModel;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
                            return new C02751(this.f25394b, aVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            Object f11;
                            f11 = kotlin.coroutines.intrinsics.b.f();
                            int i11 = this.f25393a;
                            if (i11 != 0) {
                                if (i11 == 1) {
                                    kotlin.f.b(obj);
                                } else {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            } else {
                                kotlin.f.b(obj);
                                MutableSharedFlow<Integer> g02 = this.f25394b.g0();
                                Integer d11 = kotlin.coroutines.jvm.internal.a.d(y0.O5);
                                this.f25393a = 1;
                                if (g02.emit(d11, this) == f11) {
                                    return f11;
                                }
                            }
                            return wz.p.f75480a;
                        }

                        @Override // g00.p
                        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
                            return ((C02751) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
                        }
                    }

                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ wz.p invoke() {
                        invoke2();
                        return wz.p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        BuildersKt__Builders_commonKt.launch$default(r0.a(ListingDetailsViewModel.this), null, null, new C02751(ListingDetailsViewModel.this, null), 3, null);
                    }
                };
                this.f25387a = 1;
                if (j12.r(aVar, lVar, aVar2, this) == f11) {
                    return f11;
                }
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingDetailsViewModel$loadListingDetails$1(ListingDetailsViewModel listingDetailsViewModel, zz.a<? super ListingDetailsViewModel$loadListingDetails$1> aVar) {
        super(2, aVar);
        this.f25386b = listingDetailsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingDetailsViewModel$loadListingDetails$1(this.f25386b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f25385a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            Flow<Boolean> v11 = this.f25386b.j1().v();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25386b, null);
            this.f25385a = 1;
            if (FlowKt.collectLatest(v11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return wz.p.f75480a;
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingDetailsViewModel$loadListingDetails$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
