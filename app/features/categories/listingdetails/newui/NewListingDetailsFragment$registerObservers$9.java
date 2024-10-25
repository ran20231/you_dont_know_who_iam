package com.forsale.app.features.categories.listingdetails.newui;

import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.MoreActionsBottomSheet;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import tg.c;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: NewListingDetailsFragment.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$9", f = "NewListingDetailsFragment.kt", l = {309}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class NewListingDetailsFragment$registerObservers$9 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27155a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsFragment f27156b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$9$1", f = "NewListingDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$9$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<c, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27157a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f27158b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ NewListingDetailsFragment f27159c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27159c = newListingDetailsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(c cVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(cVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27159c, aVar);
            anonymousClass1.f27158b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f27157a == 0) {
                f.b(obj);
                c cVar = (c) this.f27158b;
                if (cVar != null && this.f27159c.getActivity() != null) {
                    NewListingDetailsFragment newListingDetailsFragment = this.f27159c;
                    MoreActionsBottomSheet moreActionsBottomSheet = new MoreActionsBottomSheet();
                    newListingDetailsFragment.v0(moreActionsBottomSheet, cVar);
                    moreActionsBottomSheet.show(newListingDetailsFragment.getChildFragmentManager(), "MoreActionsBottomSheet");
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsFragment$registerObservers$9(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super NewListingDetailsFragment$registerObservers$9> aVar) {
        super(1, aVar);
        this.f27156b = newListingDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new NewListingDetailsFragment$registerObservers$9(this.f27156b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27155a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<c> C1 = this.f27156b.B().C1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27156b, null);
            this.f27155a = 1;
            if (FlowKt.collectLatest(C1, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((NewListingDetailsFragment$registerObservers$9) create(aVar)).invokeSuspend(p.f75480a);
    }
}
