package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat;

import aa.i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.m0;
import androidx.fragment.app.p;
import androidx.lifecycle.c0;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t;
import androidx.lifecycle.t0;
import com.forsale.app.datalayer.network.responses.ListingItemBrief;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatViewModel;
import com.forsale.app.features.categories.user.profile.UserProfileData;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import com.google.android.gms.ads.AdRequest;
import falcon.chat.entities.Constants;
import falcon.chat.view.SendTextFragment;
import g00.l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import t9.r0;
import t9.t0;
import wz.e;
import wz.h;
/* compiled from: ListingChatActivity.kt */
/* loaded from: classes2.dex */
public final class ListingChatActivity extends com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.a<i, ListingChatViewModel> {

    /* renamed from: y  reason: collision with root package name */
    public static final a f27334y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f27335z = 8;

    /* renamed from: j  reason: collision with root package name */
    public ListingChatViewModel.b f27337j;

    /* renamed from: i  reason: collision with root package name */
    private final int f27336i = t0.f70196e;

    /* renamed from: x  reason: collision with root package name */
    private final h f27338x = new s0(s.b(ListingChatViewModel.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtension.kt */
        /* loaded from: classes2.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ ListingChatActivity f27341f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, Bundle bundle, ListingChatActivity listingChatActivity) {
                super(pVar, bundle);
                this.f27341f = listingChatActivity;
            }

            @Override // androidx.lifecycle.a
            protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                String str;
                String str2;
                String str3;
                o.i(key, "key");
                o.i(modelClass, "modelClass");
                o.i(handle, "handle");
                String stringExtra = this.f27341f.getIntent().getStringExtra(Constants.USER_ID);
                if (stringExtra == null) {
                    str = "";
                } else {
                    str = stringExtra;
                }
                o.f(str);
                String stringExtra2 = this.f27341f.getIntent().getStringExtra(Constants.PEER_ID);
                if (stringExtra2 == null) {
                    str2 = "";
                } else {
                    str2 = stringExtra2;
                }
                o.f(str2);
                String stringExtra3 = this.f27341f.getIntent().getStringExtra(Constants.ITEM_ID);
                String stringExtra4 = this.f27341f.getIntent().getStringExtra(Constants.ITEM_TITLE);
                if (stringExtra4 == null) {
                    str3 = "";
                } else {
                    str3 = stringExtra4;
                }
                o.f(str3);
                ListingChatViewModel a11 = this.f27341f.E0().a(new ListingChatViewModel.a(str, str2, stringExtra3, str3, this.f27341f.getIntent().getStringExtra(Constants.ITEM_IMAGE), this.f27341f.getIntent().getStringExtra("USER_PROFILE_IMAGE"), this.f27341f.getIntent().getStringExtra(Constants.PENDING_MSG)), (UserProfileData) this.f27341f.getIntent().getParcelableExtra("USER_PROFILE_DATA_OBJ"), (ListingItemBrief) this.f27341f.getIntent().getParcelableExtra("ITEM_BRIEF_OBJ"));
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
            return new a(p.this, p.this.getIntent().getExtras(), this);
        }
    }, new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3(null, this));

    /* compiled from: ListingChatActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Context context, String str, String str2, String str3, String str4, String str5, String str6, String str7, UserProfileData userProfileData, ListingItemBrief listingItemBrief, Integer num, int i11, Object obj) {
            String str8;
            String str9;
            String str10;
            String str11;
            UserProfileData userProfileData2;
            ListingItemBrief listingItemBrief2;
            Integer num2;
            if ((i11 & 4) != 0) {
                str8 = null;
            } else {
                str8 = str3;
            }
            if ((i11 & 16) != 0) {
                str9 = null;
            } else {
                str9 = str5;
            }
            if ((i11 & 32) != 0) {
                str10 = null;
            } else {
                str10 = str6;
            }
            if ((i11 & 64) != 0) {
                str11 = null;
            } else {
                str11 = str7;
            }
            if ((i11 & 128) != 0) {
                userProfileData2 = null;
            } else {
                userProfileData2 = userProfileData;
            }
            if ((i11 & 256) != 0) {
                listingItemBrief2 = null;
            } else {
                listingItemBrief2 = listingItemBrief;
            }
            if ((i11 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
                num2 = null;
            } else {
                num2 = num;
            }
            aVar.a(context, str, str2, str8, str4, str9, str10, str11, userProfileData2, listingItemBrief2, num2);
        }

        public final void a(Context context, String userId, String peerId, String str, String itemTitle, String str2, String str3, String str4, UserProfileData userProfileData, ListingItemBrief listingItemBrief, Integer num) {
            o.i(context, "<this>");
            o.i(userId, "userId");
            o.i(peerId, "peerId");
            o.i(itemTitle, "itemTitle");
            Intent intent = new Intent(context, ListingChatActivity.class);
            intent.putExtra(Constants.USER_ID, userId);
            intent.putExtra(Constants.PEER_ID, peerId);
            if (str != null) {
                intent.putExtra(Constants.ITEM_ID, str);
            }
            intent.putExtra(Constants.ITEM_TITLE, itemTitle);
            if (str2 != null) {
                intent.putExtra(Constants.ITEM_IMAGE, str2);
            }
            if (str3 != null) {
                intent.putExtra("USER_PROFILE_IMAGE", str3);
            }
            if (str4 != null) {
                intent.putExtra(Constants.PENDING_MSG, str4);
            }
            if (userProfileData != null) {
                intent.putExtra("USER_PROFILE_DATA_OBJ", userProfileData);
            }
            if (listingItemBrief != null) {
                intent.putExtra("ITEM_BRIEF_OBJ", listingItemBrief);
            }
            if (num != null) {
                num.intValue();
                intent.setFlags(num.intValue());
            }
            context.startActivity(intent);
        }
    }

    /* compiled from: ListingChatActivity.kt */
    /* loaded from: classes2.dex */
    static final class b implements c0, k {

        /* renamed from: a  reason: collision with root package name */
        private final /* synthetic */ l f27342a;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(l function) {
            o.i(function, "function");
            this.f27342a = function;
        }

        @Override // kotlin.jvm.internal.k
        public final e<?> c() {
            return this.f27342a;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof c0) || !(obj instanceof k)) {
                return false;
            }
            return o.d(c(), ((k) obj).c());
        }

        public final int hashCode() {
            return c().hashCode();
        }

        @Override // androidx.lifecycle.c0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27342a.invoke(obj);
        }
    }

    private final void H0() {
        setSupportActionBar(((i) o0()).R);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.D(x0().z0().c());
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.t(true);
        }
    }

    private final void I0() {
        J0();
        K0();
    }

    private final void J0() {
        boolean z11;
        boolean N;
        SendTextFragment sendTextFragment = new SendTextFragment();
        Bundle bundle = new Bundle();
        bundle.putString(Constants.USER_ID, x0().z0().f());
        bundle.putString(Constants.PEER_ID, x0().z0().d());
        if (x0().z0().a() != null) {
            bundle.putString(Constants.ITEM_ID, x0().z0().a());
        }
        bundle.putString(Constants.ITEM_TITLE, x0().z0().c());
        String b11 = x0().z0().b();
        if (b11 != null) {
            if (b11.length() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                N = StringsKt__StringsKt.N(b11, "/images/no_image_new", false, 2, null);
                if (!N) {
                    bundle.putString(Constants.ITEM_IMAGE, x0().z0().b());
                }
            }
        }
        bundle.putString(Constants.PENDING_MSG, x0().z0().e());
        sendTextFragment.setArguments(bundle);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        o.h(supportFragmentManager, "getSupportFragmentManager(...)");
        m0 q11 = supportFragmentManager.q();
        q11.s(r0.M2, sendTextFragment);
        q11.j();
    }

    private final void K0() {
        BuildersKt__Builders_commonKt.launch$default(t.a(this), null, null, new ListingChatActivity$initializeObservers$1(this, null), 3, null);
    }

    public final ListingChatViewModel.b E0() {
        ListingChatViewModel.b bVar = this.f27337j;
        if (bVar != null) {
            return bVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: G0 */
    public ListingChatViewModel x0() {
        return (ListingChatViewModel) this.f27338x.getValue();
    }

    @Override // com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.a, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        x10.a.b("ListingChat::onCreate", new Object[0]);
        H0();
        I0();
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f27336i;
    }
}
