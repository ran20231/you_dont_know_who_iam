package com.forsale.app.features.postad.extraattributes.attributesgroupitem;

import aa.sh;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.forsale.app.datalayer.database.ExtraAttributeFlatGroupEntity;
import com.forsale.app.datalayer.repositories.ApplicationResourcesRepository;
import com.forsale.app.features.postad.PostAdViewModel;
import com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItem;
import com.forsale.app.features.postad.extraattributes.attributesitem.AttributesItem;
import java.util.List;
import kotlin.d;
import kotlin.jvm.internal.o;
import kr.b;
import kr.m;
import nf.q0;
import pr.a;
import t9.r0;
import t9.t0;
import wz.h;
/* compiled from: AttributesGroupItem.kt */
/* loaded from: classes2.dex */
public final class AttributesGroupItem extends a<ViewHolder> {

    /* renamed from: f  reason: collision with root package name */
    private final AttributesGroupItemViewModel f35177f;

    /* renamed from: g  reason: collision with root package name */
    private final Fragment f35178g;

    /* renamed from: h  reason: collision with root package name */
    private final PostAdViewModel f35179h;

    /* renamed from: i  reason: collision with root package name */
    private final int f35180i;

    /* renamed from: j  reason: collision with root package name */
    private final int f35181j;

    /* compiled from: AttributesGroupItem.kt */
    /* loaded from: classes2.dex */
    public static final class ViewHolder extends b.c<AttributesGroupItem> {

        /* renamed from: a  reason: collision with root package name */
        private final sh f35182a;

        /* renamed from: b  reason: collision with root package name */
        private final Fragment f35183b;

        /* renamed from: c  reason: collision with root package name */
        private final lr.a<m<?>> f35184c;

        /* renamed from: d  reason: collision with root package name */
        private final lr.a<m<?>> f35185d;

        /* renamed from: e  reason: collision with root package name */
        private final b<m<?>> f35186e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public ViewHolder(aa.sh r5, androidx.fragment.app.Fragment r6) {
            /*
                r4 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.o.i(r5, r0)
                java.lang.String r0 = "lifecycleOwner"
                kotlin.jvm.internal.o.i(r6, r0)
                android.view.View r0 = r5.getRoot()
                java.lang.String r1 = "getRoot(...)"
                kotlin.jvm.internal.o.h(r0, r1)
                r4.<init>(r0)
                r4.f35182a = r5
                r4.f35183b = r6
                lr.a r6 = new lr.a
                r6.<init>()
                r4.f35184c = r6
                lr.a r0 = new lr.a
                r0.<init>()
                r4.f35185d = r0
                kr.b$a r1 = kr.b.f61943t
                r2 = 2
                lr.a[] r2 = new lr.a[r2]
                r3 = 0
                r2[r3] = r6
                r6 = 1
                r2[r6] = r0
                java.util.List r0 = kotlin.collections.p.q(r2)
                java.util.Collection r0 = (java.util.Collection) r0
                kr.b r0 = r1.g(r0)
                r4.f35186e = r0
                androidx.recyclerview.widget.RecyclerView r1 = r5.O
                androidx.recyclerview.widget.LinearLayoutManager r2 = new androidx.recyclerview.widget.LinearLayoutManager
                android.view.View r5 = r5.getRoot()
                android.content.Context r5 = r5.getContext()
                r2.<init>(r5)
                r1.setLayoutManager(r2)
                r0.setHasStableIds(r6)
                sr.a r5 = sr.c.a(r0)
                r5.y(r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItem.ViewHolder.<init>(aa.sh, androidx.fragment.app.Fragment):void");
        }

        private static final ApplicationResourcesRepository h(h<ApplicationResourcesRepository> hVar) {
            return hVar.getValue();
        }

        @Override // kr.b.c
        /* renamed from: g */
        public void b(AttributesGroupItem item, List<? extends Object> payloads) {
            h a11;
            boolean z11;
            o.i(item, "item");
            o.i(payloads, "payloads");
            a11 = d.a(new g00.a<ApplicationResourcesRepository>() { // from class: com.forsale.app.features.postad.extraattributes.attributesgroupitem.AttributesGroupItem$ViewHolder$bindView$resourcesRepository$2
                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    super(0);
                }

                @Override // g00.a
                /* renamed from: b */
                public final ApplicationResourcesRepository invoke() {
                    sh shVar;
                    q0.a aVar = q0.f64094d;
                    shVar = AttributesGroupItem.ViewHolder.this.f35182a;
                    Context context = shVar.getRoot().getContext();
                    o.h(context, "getContext(...)");
                    return aVar.a(context).e();
                }
            });
            String b11 = item.f35177f.b();
            int i11 = 1;
            if (b11 != null && b11.length() != 0) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11 && item.f35177f.k() != null) {
                this.f35184c.n(new re.a(new re.b(h(a11), item.f35177f.b(), item.f35177f.k().booleanValue())));
            }
            for (ExtraAttributeFlatGroupEntity extraAttributeFlatGroupEntity : item.f35177f.a()) {
                lr.a<m<?>> aVar = this.f35185d;
                m[] mVarArr = new m[i11];
                mVarArr[0] = new AttributesItem(new te.a(extraAttributeFlatGroupEntity, item.f35177f.h(), item.f35177f.g(), item.f35177f.i(), item.f35177f.f(), item.f35177f.e(), item.f35177f.d(), item.w()), this.f35183b);
                aVar.n(mVarArr);
                i11 = 1;
            }
            this.f35182a.O.setAdapter(this.f35186e);
            this.f35182a.u();
        }

        @Override // kr.b.c
        /* renamed from: i */
        public void e(AttributesGroupItem item) {
            o.i(item, "item");
            this.f35182a.O.setAdapter(null);
            this.f35184c.r().clear();
            this.f35184c.q();
            this.f35185d.r().clear();
            this.f35185d.q();
        }
    }

    public AttributesGroupItem(AttributesGroupItemViewModel viewModel, Fragment lifecycleOwner, PostAdViewModel postAdViewModel) {
        o.i(viewModel, "viewModel");
        o.i(lifecycleOwner, "lifecycleOwner");
        this.f35177f = viewModel;
        this.f35178g = lifecycleOwner;
        this.f35179h = postAdViewModel;
        this.f35180i = t0.f70222h4;
        this.f35181j = r0.f69876d7;
    }

    @Override // kr.m
    public int getType() {
        return this.f35181j;
    }

    @Override // pr.a
    public int t() {
        return this.f35180i;
    }

    public final PostAdViewModel w() {
        return this.f35179h;
    }

    @Override // pr.a
    /* renamed from: x */
    public ViewHolder u(View v11) {
        o.i(v11, "v");
        sh f02 = sh.f0(v11);
        o.h(f02, "bind(...)");
        return new ViewHolder(f02, this.f35178g);
    }
}
