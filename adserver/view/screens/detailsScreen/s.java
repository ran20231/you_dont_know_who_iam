package com.forsale.adserver.view.screens.detailsScreen;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.forsale.adserver.utils.viewsUtils.UtilsKt;
import com.google.logging.type.LogSeverity;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: SaveImageSheet.kt */
/* loaded from: classes2.dex */
public final class s extends com.google.android.material.bottomsheet.d {

    /* renamed from: f  reason: collision with root package name */
    public static final a f21381f = new a(null);

    /* renamed from: g  reason: collision with root package name */
    public static final int f21382g = 8;

    /* renamed from: b  reason: collision with root package name */
    private final int f21383b = LogSeverity.INFO_VALUE;

    /* renamed from: c  reason: collision with root package name */
    private final String f21384c = "IMAGE_URL_TO_SAVE";

    /* renamed from: d  reason: collision with root package name */
    private String f21385d = "";

    /* renamed from: e  reason: collision with root package name */
    public t8.s f21386e;

    /* compiled from: SaveImageSheet.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s a(String imgUrl) {
            kotlin.jvm.internal.o.i(imgUrl, "imgUrl");
            s sVar = new s();
            Bundle bundle = new Bundle();
            bundle.putString(sVar.f21384c, imgUrl);
            sVar.setArguments(bundle);
            return sVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(s this$0, View view) {
        kotlin.jvm.internal.o.i(this$0, "this$0");
        if (androidx.core.content.b.checkSelfPermission(this$0.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            Context context = this$0.getContext();
            if (context != null) {
                UtilsKt.b(context, this$0.f21385d);
            }
            this$0.dismiss();
            return;
        }
        this$0.requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, this$0.f21383b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(s this$0, View view) {
        kotlin.jvm.internal.o.i(this$0, "this$0");
        Context context = this$0.getContext();
        if (context != null) {
            m9.f.j(context, this$0.f21385d);
        }
        this$0.dismiss();
    }

    @Override // androidx.fragment.app.j, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String str2 = "";
        if (arguments != null) {
            str = arguments.getString(this.f21384c, "");
        } else {
            str = null;
        }
        if (str != null) {
            str2 = str;
        }
        this.f21385d = str2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.o.i(inflater, "inflater");
        t8.s f02 = t8.s.f0(inflater, viewGroup, false);
        kotlin.jvm.internal.o.h(f02, "inflate(...)");
        y(f02);
        return t().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.i(permissions, "permissions");
        kotlin.jvm.internal.o.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        if (i11 == this.f21383b && kotlin.jvm.internal.o.d(permissions[0], "android.permission.WRITE_EXTERNAL_STORAGE") && grantResults[0] == 0) {
            Context context = getContext();
            if (context != null) {
                UtilsKt.b(context, this.f21385d);
            }
            dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.o.i(view, "view");
        super.onViewCreated(view, bundle);
        t().O.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.detailsScreen.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s.w(s.this, view2);
            }
        });
        t().P.setOnClickListener(new View.OnClickListener() { // from class: com.forsale.adserver.view.screens.detailsScreen.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                s.x(s.this, view2);
            }
        });
    }

    public final t8.s t() {
        t8.s sVar = this.f21386e;
        if (sVar != null) {
            return sVar;
        }
        kotlin.jvm.internal.o.w("binding");
        return null;
    }

    public final void y(t8.s sVar) {
        kotlin.jvm.internal.o.i(sVar, "<set-?>");
        this.f21386e = sVar;
    }
}
