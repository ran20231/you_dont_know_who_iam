package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import cb.c;
import com.forsale.app.features.auth.e;
import com.forsale.app.features.auth.login.SignInIntention;
import com.forsale.app.features.categories.listingdetails.ListingDetailsActivity;
import com.forsale.app.features.categories.listingdetails.ShareText;
import com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowBottomSheet;
import com.forsale.app.ui.bottomsheets.updateapp.UpdateAppAlertBottomSheet;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.analytics.auth.AuthenticationSourcePage;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaDialog.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$registerMediaEventsObservers$1", f = "MediaDialog.kt", l = {424}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MediaDialog$registerMediaEventsObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26175a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MediaDialogViewModel f26176b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ ListingDetailsActivity f26177c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ MediaDialog f26178d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediaDialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$registerMediaEventsObservers$1$1", f = "MediaDialog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$registerMediaEventsObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<cb.c, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26179a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26180b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ListingDetailsActivity f26181c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MediaDialog f26182d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ListingDetailsActivity listingDetailsActivity, MediaDialog mediaDialog, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f26181c = listingDetailsActivity;
            this.f26182d = mediaDialog;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(cb.c cVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(cVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26181c, this.f26182d, aVar);
            anonymousClass1.f26180b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.forsale.app.features.auth.e e12;
            com.forsale.app.features.auth.e e13;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f26179a == 0) {
                kotlin.f.b(obj);
                final cb.c cVar = (cb.c) this.f26180b;
                if (cVar instanceof c.b) {
                    ListingDetailsActivity listingDetailsActivity = this.f26181c;
                    if (listingDetailsActivity != null && (e13 = listingDetailsActivity.e1()) != null) {
                        c.b bVar = (c.b) cVar;
                        AuthenticationSourcePage authenticationSourcePage = bVar.b().getAuthenticationSourcePage();
                        SignInIntention b11 = bVar.b();
                        final MediaDialog mediaDialog = this.f26182d;
                        e.a.a(e13, authenticationSourcePage, b11, null, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.registerMediaEventsObservers.1.1.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // g00.a
                            public /* bridge */ /* synthetic */ p invoke() {
                                invoke2();
                                return p.f75480a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                MediaDialog.Q(MediaDialog.this, ((c.b) cVar).a(), null, null, 6, null);
                            }
                        }, 4, null);
                    }
                } else if (cVar instanceof c.C0195c) {
                    ListingDetailsActivity listingDetailsActivity2 = this.f26181c;
                    if (listingDetailsActivity2 != null && (e12 = listingDetailsActivity2.e1()) != null) {
                        c.C0195c c0195c = (c.C0195c) cVar;
                        AuthenticationSourcePage authenticationSourcePage2 = c0195c.b().getAuthenticationSourcePage();
                        SignInIntention b12 = c0195c.b();
                        final MediaDialog mediaDialog2 = this.f26182d;
                        e.a.a(e12, authenticationSourcePage2, b12, null, new g00.a<p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.registerMediaEventsObservers.1.1.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // g00.a
                            public /* bridge */ /* synthetic */ p invoke() {
                                invoke2();
                                return p.f75480a;
                            }

                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ChatNowBottomSheet.a aVar = ChatNowBottomSheet.B;
                                FragmentManager childFragmentManager = MediaDialog.this.getChildFragmentManager();
                                o.h(childFragmentManager, "getChildFragmentManager(...)");
                                ChatNowBottomSheet.a.b(aVar, childFragmentManager, ((c.C0195c) cVar).a(), null, 4, null);
                            }
                        }, 4, null);
                    }
                } else if (cVar instanceof c.a) {
                    Context context = this.f26182d.getContext();
                    if (context != null) {
                        MediaDialog mediaDialog3 = this.f26182d;
                        UpdateAppAlertBottomSheet updateAppAlertBottomSheet = new UpdateAppAlertBottomSheet(null, 1, null);
                        FragmentManager childFragmentManager = mediaDialog3.getChildFragmentManager();
                        o.h(childFragmentManager, "getChildFragmentManager(...)");
                        updateAppAlertBottomSheet.a(childFragmentManager, context);
                    }
                } else if (cVar instanceof c.d) {
                    ShareText a11 = ((c.d) cVar).a();
                    Context context2 = this.f26182d.getContext();
                    if (context2 != null) {
                        o.f(context2);
                        ContextExtensionsKt.P(context2, a11.c(), a11.b());
                    }
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDialog$registerMediaEventsObservers$1(MediaDialogViewModel mediaDialogViewModel, ListingDetailsActivity listingDetailsActivity, MediaDialog mediaDialog, zz.a<? super MediaDialog$registerMediaEventsObservers$1> aVar) {
        super(1, aVar);
        this.f26176b = mediaDialogViewModel;
        this.f26177c = listingDetailsActivity;
        this.f26178d = mediaDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MediaDialog$registerMediaEventsObservers$1(this.f26176b, this.f26177c, this.f26178d, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26175a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<cb.c> B = this.f26176b.B();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26177c, this.f26178d, null);
            this.f26175a = 1;
            if (FlowKt.collectLatest(B, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MediaDialog$registerMediaEventsObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
