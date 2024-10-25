package com.forsale.app.features.categories.listingdetails.newui;

import androidx.fragment.app.FragmentManager;
import com.forsale.app.features.categories.listingdetails.ListingDetailsViewModel;
import com.forsale.app.ui.bottomsheets.listingdetailsdeleteaction.choosereason.DeleteActionBottomSheet;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: NewListingDetailsFragment.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$28", f = "NewListingDetailsFragment.kt", l = {451}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NewListingDetailsFragment$registerObservers$28 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27133a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsFragment f27134b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$28$1", f = "NewListingDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$28$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<Integer, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27135a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ int f27136b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NewListingDetailsFragment f27137c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27137c = newListingDetailsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27137c, aVar);
            anonymousClass1.f27136b = ((Number) obj).intValue();
            return anonymousClass1;
        }

        public final Object invoke(int i11, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(Integer.valueOf(i11), aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f27135a == 0) {
                f.b(obj);
                int i11 = this.f27136b;
                DeleteActionBottomSheet.a aVar = DeleteActionBottomSheet.D;
                FragmentManager childFragmentManager = this.f27137c.getChildFragmentManager();
                o.h(childFragmentManager, "getChildFragmentManager(...)");
                boolean d11 = o.d(this.f27137c.B().x2().getValue(), kotlin.coroutines.jvm.internal.a.a(false));
                final NewListingDetailsFragment newListingDetailsFragment = this.f27137c;
                aVar.a(i11, childFragmentManager, d11, new l<Boolean, p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment.registerObservers.28.1.1

                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* compiled from: NewListingDetailsFragment.kt */
                    @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$28$1$1$1", f = "NewListingDetailsFragment.kt", l = {}, m = "invokeSuspend")
                    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$28$1$1$1  reason: invalid class name and collision with other inner class name */
                    /* loaded from: classes2.dex */
                    public static final class C02911 extends SuspendLambda implements g00.p<CoroutineScope, zz.a<? super p>, Object> {

                        /* renamed from: a  reason: collision with root package name */
                        int f27139a;

                        /* renamed from: b  reason: collision with root package name */
                        final /* synthetic */ NewListingDetailsFragment f27140b;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        C02911(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super C02911> aVar) {
                            super(2, aVar);
                            this.f27140b = newListingDetailsFragment;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
                            return new C02911(this.f27140b, aVar);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final Object invokeSuspend(Object obj) {
                            kotlin.coroutines.intrinsics.b.f();
                            if (this.f27139a == 0) {
                                f.b(obj);
                                ListingDetailsViewModel.V1(this.f27140b.l0(), false, false, 3, null);
                                return p.f75480a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }

                        @Override // g00.p
                        public final Object invoke(CoroutineScope coroutineScope, zz.a<? super p> aVar) {
                            return ((C02911) create(coroutineScope, aVar)).invokeSuspend(p.f75480a);
                        }
                    }

                    {
                        super(1);
                    }

                    @Override // g00.l
                    public /* bridge */ /* synthetic */ p invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return p.f75480a;
                    }

                    public final void invoke(boolean z11) {
                        NewListingDetailsFragment newListingDetailsFragment2 = NewListingDetailsFragment.this;
                        BuildersKt__Builders_commonKt.launch$default(newListingDetailsFragment2, null, null, new C02911(newListingDetailsFragment2, null), 3, null);
                    }
                });
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // g00.p
        public /* bridge */ /* synthetic */ Object invoke(Integer num, zz.a<? super p> aVar) {
            return invoke(num.intValue(), aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsFragment$registerObservers$28(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super NewListingDetailsFragment$registerObservers$28> aVar) {
        super(1, aVar);
        this.f27134b = newListingDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new NewListingDetailsFragment$registerObservers$28(this.f27134b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27133a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<Integer> T1 = this.f27134b.B().T1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27134b, null);
            this.f27133a = 1;
            if (FlowKt.collectLatest(T1, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((NewListingDetailsFragment$registerObservers$28) create(aVar)).invokeSuspend(p.f75480a);
    }
}
