package com.forsale.app.features.postad.addons.addonitem;

import aa.gh;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.forsale.app.datalayer.network.responses.Addon;
import com.forsale.app.features.more.WebActivity;
import com.forsale.app.features.more.WebType;
import com.forsale.app.utils.LifeCycleUtilsKt;
import java.util.List;
import kotlin.jvm.internal.o;
import kr.b;
import pr.a;
import t9.r0;
import t9.t0;
import t9.y0;
/* compiled from: AddonItem.kt */
/* loaded from: classes2.dex */
public final class AddonItem extends a<ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final AddonItemViewModel f34413f;

    /* renamed from: g  reason: collision with root package name */
    private final Fragment f34414g;

    /* renamed from: h  reason: collision with root package name */
    private final String f34415h;

    /* renamed from: i  reason: collision with root package name */
    private final int f34416i;

    /* renamed from: j  reason: collision with root package name */
    private final int f34417j;

    /* compiled from: AddonItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<AddonItem> {

        /* renamed from: a  reason: collision with root package name */
        private final gh f34418a;

        /* renamed from: b  reason: collision with root package name */
        private final Fragment f34419b;

        /* renamed from: c  reason: collision with root package name */
        private final AddonItemViewModel f34420c;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.gh r3, androidx.fragment.app.Fragment r4, com.forsale.app.features.postad.addons.addonitem.AddonItemViewModel r5) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                java.lang.String r0 = "fragment"
                kotlin.jvm.internal.o.i(r4, r0)
                java.lang.String r0 = "viewModel"
                kotlin.jvm.internal.o.i(r5, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f34418a = r3
                r2.f34419b = r4
                r2.f34420c = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.addons.addonitem.AddonItem.ViewHolder.<init>(aa.gh, androidx.fragment.app.Fragment, com.forsale.app.features.postad.addons.addonitem.AddonItemViewModel):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h(Addon addon) {
            Context context = this.f34419b.getContext();
            if (context != null) {
                WebActivity.a aVar = WebActivity.I;
                WebType webType = WebType.ADDON_HELP;
                String string = context.getString(y0.f70695u);
                o.h(string, "getString(...)");
                WebActivity.a.d(aVar, context, webType, string, addon.getHelpUrl(), 0, addon.getId(), 8, null);
            }
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(AddonItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            this.f34418a.h0(item.x());
            item.x().o(item.x().l());
            this.f34418a.u();
            LifeCycleUtilsKt.b(item.v(), new AddonItem$ViewHolder$bindView$1(item, this, null));
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void e(AddonItem item) {
            o.i(item, "item");
            this.f34418a.O.setImageDrawable(null);
        }
    }

    public AddonItem(AddonItemViewModel viewModel, Fragment fragment, String backgroundColor) {
        o.i(viewModel, "viewModel");
        o.i(fragment, "fragment");
        o.i(backgroundColor, "backgroundColor");
        this.f34413f = viewModel;
        this.f34414g = fragment;
        this.f34415h = backgroundColor;
        this.f34416i = t0.f70180b4;
        this.f34417j = r0.Y6;
    }

    @Override // kr.m
    public int getType() {
        return this.f34417j;
    }

    @Override // pr.a
    public int t() {
        return this.f34416i;
    }

    public final Fragment v() {
        return this.f34414g;
    }

    @Override // pr.a
    /* renamed from: w */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        gh f02 = gh.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02, this.f34414g, this.f34413f);
    }

    public final AddonItemViewModel x() {
        return this.f34413f;
    }
}
