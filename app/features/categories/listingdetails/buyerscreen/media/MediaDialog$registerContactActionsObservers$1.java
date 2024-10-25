package com.forsale.app.features.categories.listingdetails.buyerscreen.media;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import cb.b;
import com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowBottomSheet;
import com.forsale.app.ui.bottomsheets.listingdetailsmoreactions.UserContactMode;
import com.forsale.app.utils.ContextExtensionsKt;
import g00.l;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlow;
import wz.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MediaDialog.kt */
@kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$registerContactActionsObservers$1", f = "MediaDialog.kt", l = {378}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class MediaDialog$registerContactActionsObservers$1 extends SuspendLambda implements l<zz.a<? super p>, Object> {

    /* renamed from: a  reason: collision with root package name */
    int f26167a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ MediaDialogViewModel f26168b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ MediaDialog f26169c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: MediaDialog.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$registerContactActionsObservers$1$1", f = "MediaDialog.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog$registerContactActionsObservers$1$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends SuspendLambda implements g00.p<cb.b, zz.a<? super p>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f26170a;

        /* renamed from: b  reason: collision with root package name */
        /* synthetic */ Object f26171b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ MediaDialog f26172c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ MediaDialogViewModel f26173d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MediaDialog mediaDialog, MediaDialogViewModel mediaDialogViewModel, zz.a<? super AnonymousClass1> aVar) {
            super(2, aVar);
            this.f26172c = mediaDialog;
            this.f26173d = mediaDialogViewModel;
        }

        @Override // g00.p
        /* renamed from: b */
        public final Object invoke(cb.b bVar, zz.a<? super p> aVar) {
            return ((AnonymousClass1) create(bVar, aVar)).invokeSuspend(p.f75480a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final zz.a<p> create(Object obj, zz.a<?> aVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26172c, this.f26173d, aVar);
            anonymousClass1.f26171b = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str;
            kotlin.coroutines.intrinsics.b.f();
            if (this.f26170a == 0) {
                kotlin.f.b(obj);
                cb.b bVar = (cb.b) this.f26171b;
                if (bVar instanceof b.a) {
                    Context context = this.f26172c.getContext();
                    if (context != null) {
                        ContextExtensionsKt.z(context, ((b.a) bVar).b());
                    }
                } else if (bVar instanceof b.C0194b) {
                    this.f26173d.N(UserContactMode.CALL_ONLY, ((b.C0194b) bVar).a());
                } else if (bVar instanceof b.f) {
                    Context context2 = this.f26172c.getContext();
                    if (context2 != null) {
                        b.f fVar = (b.f) bVar;
                        String b11 = fVar.b();
                        Context context3 = this.f26172c.getContext();
                        if (context3 != null) {
                            str = ContextExtensionsKt.t(context3, fVar.c());
                        } else {
                            str = null;
                        }
                        ContextExtensionsKt.L(context2, b11, str, new l<Throwable, p>() { // from class: com.forsale.app.features.categories.listingdetails.buyerscreen.media.MediaDialog.registerContactActionsObservers.1.1.1
                            /* renamed from: invoke  reason: avoid collision after fix types in other method */
                            public final void invoke2(Throwable it2) {
                                o.i(it2, "it");
                            }

                            @Override // g00.l
                            public /* bridge */ /* synthetic */ p invoke(Throwable th2) {
                                invoke2(th2);
                                return p.f75480a;
                            }
                        });
                    }
                } else if (bVar instanceof b.g) {
                    this.f26173d.N(UserContactMode.WHATSAPP_ONLY, ((b.g) bVar).a());
                } else if (bVar instanceof b.c) {
                    MediaDialog.Q(this.f26172c, ((b.c) bVar).a(), null, null, 6, null);
                } else if (bVar instanceof b.d) {
                    ChatNowBottomSheet.a aVar = ChatNowBottomSheet.B;
                    FragmentManager childFragmentManager = this.f26172c.getChildFragmentManager();
                    o.h(childFragmentManager, "getChildFragmentManager(...)");
                    ChatNowBottomSheet.a.b(aVar, childFragmentManager, ((b.d) bVar).a(), null, 4, null);
                }
                return p.f75480a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaDialog$registerContactActionsObservers$1(MediaDialogViewModel mediaDialogViewModel, MediaDialog mediaDialog, zz.a<? super MediaDialog$registerContactActionsObservers$1> aVar) {
        super(1, aVar);
        this.f26168b = mediaDialogViewModel;
        this.f26169c = mediaDialog;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final zz.a<p> create(zz.a<?> aVar) {
        return new MediaDialog$registerContactActionsObservers$1(this.f26168b, this.f26169c, aVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object f11;
        f11 = kotlin.coroutines.intrinsics.b.f();
        int i11 = this.f26167a;
        if (i11 != 0) {
            if (i11 == 1) {
                kotlin.f.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            kotlin.f.b(obj);
            SharedFlow<cb.b> r11 = this.f26168b.r();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26169c, this.f26168b, null);
            this.f26167a = 1;
            if (FlowKt.collectLatest(r11, anonymousClass1, this) == f11) {
                return f11;
            }
        }
        return p.f75480a;
    }

    @Override // g00.l
    public final Object invoke(zz.a<? super p> aVar) {
        return ((MediaDialog$registerContactActionsObservers$1) create(aVar)).invokeSuspend(p.f75480a);
    }
}
