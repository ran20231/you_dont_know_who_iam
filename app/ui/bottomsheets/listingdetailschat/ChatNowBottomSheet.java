package com.forsale.app.ui.bottomsheets.listingdetailschat;

import aa.q2;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.t0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.datalayer.network.responses.ListingItemDetails;
import com.forsale.app.datalayer.network.responses.listingdetails.ListingUser;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowViewModel;
import com.forsale.app.ui.bottomsheets.listingdetailschat.b;
import com.forsale.app.utils.CrashlyticsUtilsKt;
import com.forsale.app.utils.OneShotEventHandler;
import com.forsale.app.utils.TypeExtensionsKt;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7;
import com.google.android.gms.ads.AdRequest;
import kotlin.LazyThreadSafetyMode;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.FlowCollector;
import t9.t0;
import t9.z0;
import wz.h;
import wz.p;
/* compiled from: ChatNowBottomSheet.kt */
/* loaded from: classes3.dex */
public final class ChatNowBottomSheet extends og.b<q2, ChatNowViewModel> {
    public static final a B = new a(null);
    public static final int C = 8;
    private final h A;

    /* renamed from: j  reason: collision with root package name */
    private final com.forsale.app.ui.bottomsheets.listingdetailschat.b f38135j;

    /* renamed from: x  reason: collision with root package name */
    private final g00.a<p> f38136x;

    /* renamed from: y  reason: collision with root package name */
    private final int f38137y;

    /* renamed from: z  reason: collision with root package name */
    public ChatNowViewModel.a f38138z;

    /* compiled from: ChatNowBottomSheet.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void b(a aVar, FragmentManager fragmentManager, com.forsale.app.ui.bottomsheets.listingdetailschat.b bVar, g00.a aVar2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                aVar2 = null;
            }
            aVar.a(fragmentManager, bVar, aVar2);
        }

        public final void a(FragmentManager fragmentManager, com.forsale.app.ui.bottomsheets.listingdetailschat.b chatNowModel, g00.a<p> aVar) {
            o.i(fragmentManager, "fragmentManager");
            o.i(chatNowModel, "chatNowModel");
            new ChatNowBottomSheet(chatNowModel, aVar).show(fragmentManager, "ChatNowBottomSheet");
        }
    }

    /* compiled from: ChatNowBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class b implements FlowCollector<String> {
        b() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(String str, zz.a<? super p> aVar) {
            ChatNowBottomSheet.this.dismiss();
            ChatNowBottomSheet.this.H(str);
            return p.f75480a;
        }
    }

    /* compiled from: ChatNowBottomSheet.kt */
    /* loaded from: classes3.dex */
    static final class c implements FlowCollector<p> {
        c() {
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        /* renamed from: a */
        public final Object emit(p pVar, zz.a<? super p> aVar) {
            ChatNowBottomSheet.this.dismiss();
            return p.f75480a;
        }
    }

    public ChatNowBottomSheet(com.forsale.app.ui.bottomsheets.listingdetailschat.b chatNowModel, g00.a<p> aVar) {
        h b11;
        o.i(chatNowModel, "chatNowModel");
        this.f38135j = chatNowModel;
        this.f38136x = aVar;
        this.f38137y = t0.f70169a0;
        g00.a<t0.b> aVar2 = new g00.a<t0.b>() { // from class: com.forsale.app.ui.bottomsheets.listingdetailschat.ChatNowBottomSheet$special$$inlined$assistedViewModel$1

            /* compiled from: ViewModelHiltExtension.kt */
            /* loaded from: classes3.dex */
            public static final class a extends androidx.lifecycle.a {

                /* renamed from: f  reason: collision with root package name */
                final /* synthetic */ ChatNowBottomSheet f38141f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(Fragment fragment, Bundle bundle, ChatNowBottomSheet chatNowBottomSheet) {
                    super(fragment, bundle);
                    this.f38141f = chatNowBottomSheet;
                }

                @Override // androidx.lifecycle.a
                protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                    b bVar;
                    o.i(key, "key");
                    o.i(modelClass, "modelClass");
                    o.i(handle, "handle");
                    ChatNowViewModel.a E = this.f38141f.E();
                    bVar = this.f38141f.f38135j;
                    ChatNowViewModel a11 = E.a(bVar);
                    o.g(a11, "null cannot be cast to non-null type T of com.forsale.app.utils.ViewModelHiltExtensionKt.assistedViewModel.<no name provided>.invoke.<no name provided>.create");
                    return a11;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final t0.b invoke() {
                return new a(Fragment.this, Fragment.this.getArguments(), this);
            }
        };
        b11 = d.b(LazyThreadSafetyMode.NONE, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$5(new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$4(this)));
        this.A = FragmentViewModelLazyKt.b(this, s.b(ChatNowViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$6(b11), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$7(null, b11), aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(String str) {
        ListingItemDetails f11 = t().w0().f();
        if (f11 != null) {
            t().D0();
            I(f11, t().w0().c(), str);
            return;
        }
        b.a d11 = t().w0().d();
        if (d11 != null) {
            J(d11, str);
        }
    }

    private final void I(ListingItemDetails listingItemDetails, ListingItemBrief listingItemBrief, String str) {
        String str2;
        ListingChatActivity.a aVar = ListingChatActivity.f27334y;
        Context context = ((q2) r()).getRoot().getContext();
        o.h(context, "getContext(...)");
        String e11 = falcon.chat.utils.a.f56033a.e();
        String phone = listingItemDetails.getPhone();
        String valueOf = String.valueOf(listingItemDetails.getId());
        String title = listingItemDetails.getTitle();
        if (listingItemBrief != null) {
            str2 = listingItemBrief.getThumb();
        } else {
            str2 = null;
        }
        String image = listingItemDetails.getUser().getImage();
        ListingUser user = listingItemDetails.getUser();
        ListingChatActivity.a.b(aVar, context, e11, phone, valueOf, title, str2, image, str, new UserProfileData(user.getId(), user.getName(), user.getPhone(), user.getImage(), Integer.valueOf(listingItemDetails.getId()), null, null, null, TypeExtensionsKt.W(user.getPhone()), 224, null), listingItemBrief, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
    }

    private final void J(b.a aVar, String str) {
        ListingChatActivity.a aVar2 = ListingChatActivity.f27334y;
        Context context = ((q2) r()).getRoot().getContext();
        o.h(context, "getContext(...)");
        String e11 = falcon.chat.utils.a.f56033a.e();
        String h11 = aVar.c().h();
        if (h11 == null) {
            h11 = "";
        }
        ListingChatActivity.a.b(aVar2, context, e11, h11, String.valueOf(aVar.c().a()), aVar.b(), aVar.a(), aVar.c().d(), str, aVar.c(), null, null, AdRequest.MAX_CONTENT_URL_LENGTH, null);
    }

    public final ChatNowViewModel.a E() {
        ChatNowViewModel.a aVar = this.f38138z;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // w9.b
    /* renamed from: G */
    public ChatNowViewModel t() {
        return (ChatNowViewModel) this.A.getValue();
    }

    @Override // w9.b, androidx.fragment.app.j
    public int getTheme() {
        return z0.f70801k;
    }

    @Override // androidx.fragment.app.j, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        o.i(dialog, "dialog");
        super.onDismiss(dialog);
        g00.a<p> aVar = this.f38136x;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        CrashlyticsUtilsKt.b("chatNowBottomSheet", null, 2, null);
    }

    @Override // w9.b, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        o.i(view, "view");
        super.onViewCreated(view, bundle);
        OneShotEventHandler<String> z02 = t().z0();
        androidx.lifecycle.s viewLifecycleOwner = getViewLifecycleOwner();
        o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        z02.h(viewLifecycleOwner, new b());
        OneShotEventHandler<p> x02 = t().x0();
        androidx.lifecycle.s viewLifecycleOwner2 = getViewLifecycleOwner();
        o.h(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        x02.h(viewLifecycleOwner2, new c());
    }

    @Override // w9.b
    protected int s() {
        return this.f38137y;
    }
}
