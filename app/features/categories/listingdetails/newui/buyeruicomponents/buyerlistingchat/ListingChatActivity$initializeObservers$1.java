package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat;

import androidx.lifecycle.b0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.features.categories.user.profile.UserProfileActivity;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.utils.OneShotEventHandler;
import g00.l;
import g00.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.f;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ListingChatActivity.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity$initializeObservers$1", f = "ListingChatActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ListingChatActivity$initializeObservers$1 extends SuspendLambda implements p<CoroutineScope, zz.a<? super wz.p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f27343a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ListingChatActivity f27344b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListingChatActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a implements FlowCollector<ListingItemBrief> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListingChatActivity f27346a;

        a(ListingChatActivity listingChatActivity) {
            this.f27346a = listingChatActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(ListingItemBrief listingItemBrief, zz.a<? super wz.p> aVar) {
            if (listingItemBrief != null) {
                ListingDetailsActivity.a.b(ListingDetailsActivity.R, this.f27346a, listingItemBrief, null, 0, null, null, null, null, null, null, null, false, 0, null, null, null, 32766, null);
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ListingChatActivity.kt */
    /* loaded from: classes2.dex */
    public static final class b implements FlowCollector<UserProfileData> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ListingChatActivity f27347a;

        b(ListingChatActivity listingChatActivity) {
            this.f27347a = listingChatActivity;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(UserProfileData userProfileData, zz.a<? super wz.p> aVar) {
            if (userProfileData != null) {
                UserProfileActivity.a.b(UserProfileActivity.C, this.f27347a, userProfileData, null, 2, null);
            }
            return wz.p.f75480a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListingChatActivity$initializeObservers$1(ListingChatActivity listingChatActivity, zz.a<? super ListingChatActivity$initializeObservers$1> aVar) {
        super(2, aVar);
        this.f27344b = listingChatActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<wz.p> create(Object obj, zz.a<?> aVar) {
        return new ListingChatActivity$initializeObservers$1(this.f27344b, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.f();
        if (this.f27343a == 0) {
            f.b(obj);
            OneShotEventHandler<ListingItemBrief> y02 = this.f27344b.x0().y0();
            ListingChatActivity listingChatActivity = this.f27344b;
            y02.h(listingChatActivity, new a(listingChatActivity));
            OneShotEventHandler<UserProfileData> B0 = this.f27344b.x0().B0();
            ListingChatActivity listingChatActivity2 = this.f27344b;
            B0.h(listingChatActivity2, new b(listingChatActivity2));
            b0<wz.p> w02 = this.f27344b.x0().w0();
            final ListingChatActivity listingChatActivity3 = this.f27344b;
            w02.observe(listingChatActivity3, new ListingChatActivity.b(new l<wz.p, wz.p>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity$initializeObservers$1.3
                {
                    super(1);
                }

                public final void b(wz.p pVar) {
                    ListingChatActivity.this.finish();
                }

                @Override // g00.l
                public /* bridge */ /* synthetic */ wz.p invoke(wz.p pVar) {
                    b(pVar);
                    return wz.p.f75480a;
                }
            }));
            return wz.p.f75480a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // g00.p
    public final Object invoke(CoroutineScope coroutineScope, zz.a<? super wz.p> aVar) {
        return ((ListingChatActivity$initializeObservers$1) create(coroutineScope, aVar)).invokeSuspend(wz.p.f75480a);
    }
}
