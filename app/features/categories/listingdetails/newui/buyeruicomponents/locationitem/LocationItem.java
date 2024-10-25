package com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem;

import aa.ek;
import android.view.View;
import androidx.lifecycle.c0;
import androidx.lifecycle.s;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.o;
import kr.b;
import t9.r0;
import t9.t0;
import wz.h;
/* compiled from: LocationItem.kt */
/* loaded from: classes2.dex */
public final class LocationItem extends pr.a<LocationViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final a f27521f;

    /* renamed from: g  reason: collision with root package name */
    private final s f27522g;

    /* renamed from: h  reason: collision with root package name */
    private final int f27523h;

    /* renamed from: i  reason: collision with root package name */
    private final int f27524i;

    /* compiled from: LocationItem.kt */
    /* loaded from: classes2.dex */
    public static final class LocationViewHolder extends b.c<LocationItem> {

        /* renamed from: a  reason: collision with root package name */
        private final ek f27525a;

        /* renamed from: b  reason: collision with root package name */
        private final s f27526b;

        /* renamed from: c  reason: collision with root package name */
        private final a f27527c;

        /* renamed from: d  reason: collision with root package name */
        private final h f27528d;

        /* renamed from: e  reason: collision with root package name */
        private final h f27529e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public LocationViewHolder(aa.ek r3, androidx.lifecycle.s r4, com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.a r5) {
            /*
                r2 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r3, r0)
                java.lang.String r0 = "lifecycleOwner"
                kotlin.jvm.internal.o.i(r4, r0)
                java.lang.String r0 = "viewModel"
                kotlin.jvm.internal.o.i(r5, r0)
                android.view.View r0 = r3.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r2.<init>(r0)
                r2.f27525a = r3
                r2.f27526b = r4
                r2.f27527c = r5
                com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.LocationItem$LocationViewHolder$mapFacade$2 r3 = new com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.LocationItem$LocationViewHolder$mapFacade$2
                r3.<init>()
                wz.h r3 = kotlin.c.a(r3)
                r2.f27528d = r3
                com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.LocationItem$LocationViewHolder$coordinatesObserver$2 r3 = new com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.LocationItem$LocationViewHolder$coordinatesObserver$2
                r3.<init>()
                wz.h r3 = kotlin.c.a(r3)
                r2.f27529e = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.LocationItem.LocationViewHolder.<init>(aa.ek, androidx.lifecycle.s, com.forsale.app.features.categories.listingdetails.newui.buyeruicomponents.locationitem.a):void");
        }

        private final c0<Pair<Double, Double>> j() {
            return (c0) this.f27529e.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final com.forsale.app.utils.facades.map.a k() {
            return (com.forsale.app.utils.facades.map.a) this.f27528d.getValue();
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void b(LocationItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            ek ekVar = this.f27525a;
            ekVar.U(item.v());
            ekVar.h0(item.x());
            ekVar.u();
            item.x().d().observe(item.v(), j());
        }

        public final a l() {
            return this.f27527c;
        }

        @Override // kr.b.c
        /* renamed from: m */
        public void e(LocationItem item) {
            o.i(item, "item");
            this.f27525a.Z();
            item.x().d().removeObserver(j());
        }
    }

    public LocationItem(a viewModel, s lifeCycle) {
        o.i(viewModel, "viewModel");
        o.i(lifeCycle, "lifeCycle");
        this.f27521f = viewModel;
        this.f27522g = lifeCycle;
        this.f27523h = t0.N4;
        this.f27524i = r0.f70162z7;
    }

    @Override // kr.m
    public int getType() {
        return this.f27524i;
    }

    @Override // pr.a
    public int t() {
        return this.f27523h;
    }

    public final s v() {
        return this.f27522g;
    }

    @Override // pr.a
    /* renamed from: w */
    public LocationViewHolder u(View v11) {
        o.i(v11, "v");
        ek f02 = ek.f0(v11);
        o.h(f02, "bind(...)");
        return new LocationViewHolder(f02, this.f27522g, this.f27521f);
    }

    public final a x() {
        return this.f27521f;
    }
}
