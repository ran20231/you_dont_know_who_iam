package com.forsale.app.features.postad.extraattributes.attributesitem;

import aa.wh;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.datalayer.repositories.ExtraAttributeOptionDao;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontal;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownHorizontalViewModel;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVertical;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeDropDownVerticalViewModel;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeFile;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeFileViewModel;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeNumber;
import com.forsale.app.features.postad.extraattributes.attributeview.AttributeText;
import com.forsale.app.features.postad.extraattributes.enums.AttributeSubtype;
import com.forsale.app.features.postad.extraattributes.enums.AttributeType;
import java.util.List;
import kotlin.jvm.internal.o;
import kr.b;
import kr.m;
import pr.a;
import t9.r0;
import t9.t0;
import ue.c;
import ue.f;
import wz.h;
/* compiled from: AttributesItem.kt */
/* loaded from: classes2.dex */
public final class AttributesItem extends a<ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final te.a f35209f;

    /* renamed from: g  reason: collision with root package name */
    private final Fragment f35210g;

    /* renamed from: h  reason: collision with root package name */
    private final int f35211h;

    /* renamed from: i  reason: collision with root package name */
    private final int f35212i;

    /* compiled from: AttributesItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<AttributesItem> {

        /* renamed from: a  reason: collision with root package name */
        private final wh f35213a;

        /* renamed from: b  reason: collision with root package name */
        private final h f35214b;

        /* renamed from: c  reason: collision with root package name */
        private final h f35215c;

        /* renamed from: d  reason: collision with root package name */
        private final lr.a<m<?>> f35216d;

        /* renamed from: e  reason: collision with root package name */
        private final b<m<?>> f35217e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.wh r4) {
            /*
                r3 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r4, r0)
                android.view.View r0 = r4.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r3.<init>(r0)
                r3.f35213a = r4
                com.forsale.app.features.postad.extraattributes.attributesitem.AttributesItem$ViewHolder$resourceRepository$2 r0 = new com.forsale.app.features.postad.extraattributes.attributesitem.AttributesItem$ViewHolder$resourceRepository$2
                r0.<init>()
                wz.h r0 = kotlin.c.a(r0)
                r3.f35214b = r0
                com.forsale.app.features.postad.extraattributes.attributesitem.AttributesItem$ViewHolder$optionsDao$2 r0 = new com.forsale.app.features.postad.extraattributes.attributesitem.AttributesItem$ViewHolder$optionsDao$2
                r0.<init>()
                wz.h r0 = kotlin.c.a(r0)
                r3.f35215c = r0
                lr.a r0 = new lr.a
                r0.<init>()
                r3.f35216d = r0
                kr.b$a r1 = kr.b.f61943t
                java.util.List r0 = kotlin.collections.p.e(r0)
                java.util.Collection r0 = (java.util.Collection) r0
                kr.b r0 = r1.g(r0)
                r3.f35217e = r0
                androidx.recyclerview.widget.RecyclerView r1 = r4.O
                androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
                android.view.View r4 = r4.getRoot()
                android.content.Context r4 = r4.getContext()
                r2.<init>(r4)
                r1.setLayoutManager(r2)
                r4 = 1
                r0.setHasStableIds(r4)
                sr.a r0 = sr.c.a(r0)
                r0.y(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.attributesitem.AttributesItem.ViewHolder.<init>(aa.wh):void");
        }

        private final ExtraAttributeOptionDao h() {
            return (ExtraAttributeOptionDao) this.f35215c.getValue();
        }

        private final ApplicationResourcesRepository i() {
            return (ApplicationResourcesRepository) this.f35214b.getValue();
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(AttributesItem item, List<? extends Object> payloads) {
            o.i(item, "item");
            o.i(payloads, "payloads");
            String type = item.f35209f.a().getType();
            if (o.d(type, AttributeType.BOOL.getValue())) {
                this.f35216d.n(new ue.b(new c(item.f35209f.a())));
            } else if (o.d(type, AttributeType.TEXT.getValue())) {
                this.f35216d.n(new AttributeText(item.f35210g, new ue.h(item.f35209f.a(), item.f35209f.g(), item.f35209f.b())));
            } else if (o.d(type, AttributeType.NUMBER.getValue())) {
                this.f35216d.n(new AttributeNumber(item.f35210g, new f(item.f35209f.a(), item.f35209f.f())));
            } else if (o.d(type, AttributeType.DROP_DOWN.getValue())) {
                if (o.d(item.f35209f.a().getSubType(), AttributeSubtype.VERTICAL.getValue())) {
                    this.f35216d.n(new AttributeDropDownVertical(item.f35210g, new AttributeDropDownVerticalViewModel(item.f35209f.a(), h(), i(), item.f35209f.h(), t.a(item.f35210g))));
                } else {
                    this.f35216d.n(new AttributeDropDownHorizontal(item.f35210g, new AttributeDropDownHorizontalViewModel(item.f35209f.a(), h(), i(), item.f35209f.e())));
                }
            } else if (o.d(type, AttributeType.FILE.getValue())) {
                Fragment fragment = item.f35210g;
                s viewLifecycleOwner = item.f35210g.getViewLifecycleOwner();
                o.h(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                this.f35216d.n(new AttributeFile(fragment, new AttributeFileViewModel(t.a(viewLifecycleOwner), item.f35209f.a(), i(), item.f35209f.d(), item.f35209f.c())));
            }
            this.f35213a.O.setAdapter(this.f35217e);
            this.f35213a.u();
        }

        @Override // kr.b.c
        /* renamed from: j */
        public void e(AttributesItem item) {
            o.i(item, "item");
            this.f35213a.O.setAdapter(null);
            this.f35216d.r().clear();
            this.f35216d.q();
        }
    }

    public AttributesItem(te.a viewModel, Fragment lifeCycleOwner) {
        o.i(viewModel, "viewModel");
        o.i(lifeCycleOwner, "lifeCycleOwner");
        this.f35209f = viewModel;
        this.f35210g = lifeCycleOwner;
        this.f35211h = t0.f70236j4;
        this.f35212i = r0.f69902f7;
    }

    @Override // kr.m
    public int getType() {
        return this.f35212i;
    }

    @Override // pr.a
    public int t() {
        return this.f35211h;
    }

    @Override // pr.a
    /* renamed from: x */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        wh f02 = wh.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02);
    }
}
