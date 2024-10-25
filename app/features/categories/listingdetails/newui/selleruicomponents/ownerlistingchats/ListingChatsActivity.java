package com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats;

import aa.k;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.p;
import androidx.lifecycle.k0;
import androidx.lifecycle.q0;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.ListingChatActivity;
import com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.d;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2;
import com.forsale.app.utils.ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$3;
import falcon.chat.entities.Constants;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import t9.t0;
import t9.y0;
import wz.h;
import wz.i;
/* compiled from: ListingChatsActivity.kt */
/* loaded from: classes2.dex */
public final class ListingChatsActivity extends com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats.a<k, com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.d> {

    /* renamed from: j  reason: collision with root package name */
    public d.a f27845j;

    /* renamed from: y  reason: collision with root package name */
    private final h f27847y;

    /* renamed from: z  reason: collision with root package name */
    public static final a f27843z = new a(null);
    public static final int A = 8;

    /* renamed from: i  reason: collision with root package name */
    private final int f27844i = t0.f70203f;

    /* renamed from: x  reason: collision with root package name */
    private final h f27846x = new s0(s.b(com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.d.class), new ViewModelHiltExtensionKt$assistedViewModel$$inlined$viewModels$default$2(this), new g00.a<t0.b>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats.ListingChatsActivity$special$$inlined$assistedViewModel$1

        /* compiled from: ViewModelHiltExtension.kt */
        /* loaded from: classes2.dex */
        public static final class a extends androidx.lifecycle.a {

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ ListingChatsActivity f27850f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(p pVar, Bundle bundle, ListingChatsActivity listingChatsActivity) {
                super(pVar, bundle);
                this.f27850f = listingChatsActivity;
            }

            @Override // androidx.lifecycle.a
            protected <T extends q0> T e(String key, Class<T> modelClass, k0 handle) {
                o.i(key, "key");
                o.i(modelClass, "modelClass");
                o.i(handle, "handle");
                com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.d a11 = this.f27850f.G0().a(this.f27850f.getIntent().getStringExtra(Constants.ITEM_ID));
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

    /* compiled from: ListingChatsActivity.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void b(a aVar, Context context, Integer num, Integer num2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                num = 0;
            }
            if ((i11 & 2) != 0) {
                num2 = null;
            }
            aVar.a(context, num, num2);
        }

        public final void a(Context context, Integer num, Integer num2) {
            o.i(context, "<this>");
            Intent intent = new Intent(context, ListingChatsActivity.class);
            if (num != null) {
                num.intValue();
                intent.putExtra(Constants.ITEM_ID, num.toString());
            }
            if (num2 != null) {
                num2.intValue();
                intent.addFlags(num2.intValue());
            }
            context.startActivity(intent);
        }
    }

    public ListingChatsActivity() {
        h a11;
        a11 = kotlin.d.a(new g00.a<b>() { // from class: com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats.ListingChatsActivity$pagerAdapter$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final b invoke() {
                List K0;
                List a12;
                FragmentManager supportFragmentManager = ListingChatsActivity.this.getSupportFragmentManager();
                o.h(supportFragmentManager, "getSupportFragmentManager(...)");
                K0 = ListingChatsActivity.this.K0();
                a12 = CollectionsKt___CollectionsKt.a1(K0);
                return new b(supportFragmentManager, a12);
            }
        });
        this.f27847y = a11;
    }

    private final b H0() {
        return (b) this.f27847y.getValue();
    }

    private final void J0() {
        L0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<Pair<String, Fragment>> K0() {
        List<Pair<String, Fragment>> e11;
        ux.k kVar = new ux.k();
        Bundle bundle = new Bundle();
        String v02 = x0().v0();
        if (v02 != null) {
            bundle.putString(Constants.ITEM_ID, v02);
        }
        kVar.setArguments(bundle);
        kVar.s(new Intent(this, ListingChatActivity.class));
        e11 = q.e(i.a(getString(y0.P5), kVar));
        return e11;
    }

    private final void L0() {
        ((k) o0()).P.setAdapter(H0());
        ((k) o0()).Q.setupWithViewPager(((k) o0()).P);
    }

    public final d.a G0() {
        d.a aVar = this.f27845j;
        if (aVar != null) {
            return aVar;
        }
        o.w("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BaseViewModelActivity
    /* renamed from: I0 */
    public com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.d x0() {
        return (com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.buyerlistingchat.d) this.f27846x.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.features.categories.listingdetails.newui.selleruicomponents.ownerlistingchats.a, com.forsale.app.base.activities.BaseViewModelActivity, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setSupportActionBar(((k) o0()).R);
        androidx.appcompat.app.a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.D(getString(y0.P5));
        }
        androidx.appcompat.app.a supportActionBar2 = getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.t(true);
        }
        J0();
    }

    @Override // androidx.appcompat.app.d
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return this.f27844i;
    }
}
