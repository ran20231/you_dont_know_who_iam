package com.forsale.app.features.categories.listingdetails.newui;

import androidx.fragment.app.FragmentManager;
import com.forsale.app.ui.bottomsheets.listingdetailspreviewalert.PreviewAlertBottomSheet;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.f;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* compiled from: NewListingDetailsFragment.kt */
@d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$19", f = "NewListingDetailsFragment.kt", l = {377}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class NewListingDetailsFragment$registerObservers$19 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27100a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ NewListingDetailsFragment f27101b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NewListingDetailsFragment.kt */
    @d(c = "com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$19$1", f = "NewListingDetailsFragment.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.newui.NewListingDetailsFragment$registerObservers$19$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<p, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f27102a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ NewListingDetailsFragment f27103b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f27103b = newListingDetailsFragment;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(p pVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(pVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            return new AnonymousClass1(this.f27103b, aVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            kotlin.coroutines.intrinsics.b.f();
            if (this.f27102a == 0) {
                f.b(obj);
                PreviewAlertBottomSheet.a aVar = PreviewAlertBottomSheet.A;
                FragmentManager childFragmentManager = this.f27103b.getChildFragmentManager();
                o.h(childFragmentManager, "getChildFragmentManager(...)");
                aVar.a(childFragmentManager);
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewListingDetailsFragment$registerObservers$19(NewListingDetailsFragment newListingDetailsFragment, zz.a<? super NewListingDetailsFragment$registerObservers$19> aVar) {
        super(1, aVar);
        this.f27101b = newListingDetailsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new NewListingDetailsFragment$registerObservers$19(this.f27101b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f27100a;
        if (i11 != 0) {
            if (i11 == 1) {
                f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            f.b(obj);
            SharedFlow<p> o12 = this.f27101b.l0().o1();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f27101b, null);
            this.f27100a = 1;
            if (FlowKt.collectLatest(o12, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((NewListingDetailsFragment$registerObservers$19) create(aVar)).invokeSuspend(p.f75480a);
    }
}
