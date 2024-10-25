package com.forsale.adserver.view.screens.detailsScreen;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatButton;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: DialBottomSheet.kt */
/* loaded from: classes2.dex */
public final class k extends com.google.android.material.bottomsheet.d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f21363f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f21364g = 8;

    /* renamed from: c  reason: collision with root package name */
    private g00.l<? super String, wz.p> f21366c;

    /* renamed from: e  reason: collision with root package name */
    public t8.g f21368e;

    /* renamed from: b  reason: collision with root package name */
    private final String f21365b = "NUMBER_TO_DIAL";

    /* renamed from: d  reason: collision with root package name */
    private String f21367d = "";

    /* compiled from: DialBottomSheet.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ k b(a aVar, String str, g00.l lVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                lVar = null;
            }
            return aVar.a(str, lVar);
        }

        public final k a(String adNumb, g00.l<? super String, wz.p> lVar) {
            kotlin.jvm.internal.o.i(adNumb, "adNumb");
            k kVar = new k();
            kVar.f21366c = lVar;
            Bundle bundle = new Bundle();
            bundle.putString(kVar.f21365b, k9.a.a(adNumb));
            kVar.setArguments(bundle);
            return kVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(k this$0, View view) {
        kotlin.jvm.internal.o.i(this$0, "this$0");
        g00.l<? super String, wz.p> lVar = this$0.f21366c;
        if (lVar != null) {
            lVar.invoke(this$0.f21367d);
        }
        Intent intent = new Intent("android.intent.action.DIAL");
        String str = this$0.f21367d;
        intent.setData(Uri.parse("tel:" + str));
        this$0.startActivity(intent);
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments != null) {
            str = arguments.getString(this.f21365b, "");
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str;
        }
        this.f21367d = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.o.i(inflater, "inflater");
        t8.g f02 = t8.g.f0(inflater, viewGroup, false);
        kotlin.jvm.internal.o.h(f02, "inflate(...)");
        x(f02);
        return t().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.o.i(view, "view");
        super.onViewCreated(view, bundle);
        AppCompatButton appCompatButton = t().O;
        appCompatButton.setText(this.f21367d);
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.detailsScreen.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                k.w(k.this, view2);
            }
        });
    }

    public final t8.g t() {
        t8.g gVar = this.f21368e;
        if (gVar != null) {
            return gVar;
        }
        kotlin.jvm.internal.o.w("binding");
        return null;
    }

    public final void x(t8.g gVar) {
        kotlin.jvm.internal.o.i(gVar, "<set-?>");
        this.f21368e = gVar;
    }
}
