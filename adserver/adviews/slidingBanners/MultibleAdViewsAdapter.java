package com.forsale.adserver.adviews.slidingBanners;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.forsale.adserver.adviews.baseViews.a;
import com.forsale.adserver.adviews.baseViews.image.AdImageView;
import com.forsale.adserver.adviews.baseViews.webView.MyWebView;
import com.forsale.adserver.datalayer.bannerdata.ScreenBannerTypes;
import com.forsale.adserver.datalayer.bannerdata.Screens;
import com.forsale.adserver.view.models.AdGeneralModel;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import l8.g;
import m9.f;
import p8.c;
import r8.b;
import wz.p;
/* compiled from: MultibleAdViewsAdapter.kt */
/* loaded from: classes2.dex */
public final class MultibleAdViewsAdapter extends RecyclerView.Adapter<RecyclerView.d0> {

    /* renamed from: f */
    public static final a f20606f = new a(null);

    /* renamed from: g */
    public static final int f20607g = 8;

    /* renamed from: a */
    private final ArrayList<AdGeneralModel> f20608a;

    /* renamed from: b */
    private final com.forsale.adserver.adviews.baseViews.a f20609b;

    /* renamed from: c */
    private final ScreenBannerTypes f20610c;

    /* renamed from: d */
    private final Screens f20611d;

    /* renamed from: e */
    private final Integer f20612e;

    /* compiled from: MultibleAdViewsAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public MultibleAdViewsAdapter(ArrayList<AdGeneralModel> adsList, com.forsale.adserver.adviews.baseViews.a adClickListener, ScreenBannerTypes bannerType, Screens screen, Integer num) {
        o.i(adsList, "adsList");
        o.i(adClickListener, "adClickListener");
        o.i(bannerType, "bannerType");
        o.i(screen, "screen");
        this.f20608a = adsList;
        this.f20609b = adClickListener;
        this.f20610c = bannerType;
        this.f20611d = screen;
        this.f20612e = num;
    }

    public static final void g(MultibleAdViewsAdapter this$0, int i11, View view) {
        o.i(this$0, "this$0");
        com.forsale.adserver.adviews.baseViews.a aVar = this$0.f20609b;
        AdGeneralModel adGeneralModel = this$0.f20608a.get(i11);
        o.h(adGeneralModel, "get(...)");
        aVar.a(new AdGeneralModel[]{adGeneralModel}, 0, this$0.f20610c, this$0.f20611d, this$0.f20612e);
    }

    public static final void h(MultibleAdViewsAdapter this$0, int i11, View view) {
        o.i(this$0, "this$0");
        com.forsale.adserver.adviews.baseViews.a aVar = this$0.f20609b;
        AdGeneralModel adGeneralModel = this$0.f20608a.get(i11);
        o.h(adGeneralModel, "get(...)");
        aVar.a(new AdGeneralModel[]{adGeneralModel}, 0, this$0.f20610c, this$0.f20611d, this$0.f20612e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f20608a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i11) {
        AdGeneralModel adGeneralModel = this.f20608a.get(i11);
        o.h(adGeneralModel, "get(...)");
        String i12 = adGeneralModel.i();
        if (o.d(i12, "image") || !o.d(i12, "HTML")) {
            return -5;
        }
        return -4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 p02, final int i11) {
        o.i(p02, "p0");
        String str = "";
        if (p02 instanceof n8.a) {
            n8.a aVar = (n8.a) p02;
            AdImageView a11 = aVar.a();
            if (a11 != null) {
                String h11 = this.f20608a.get(i11).h();
                if (h11 != null) {
                    str = h11;
                }
                a11.c(str);
            }
            AdImageView a12 = aVar.a();
            if (a12 != null) {
                a12.setOnClickListener(new r8.a(this, i11));
            }
            AdImageView a13 = aVar.a();
            if (a13 != null) {
                f.b(a13, new g00.a<p>() { // from class: com.forsale.adserver.adviews.slidingBanners.MultibleAdViewsAdapter$onBindViewHolder$2
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        a aVar2;
                        ArrayList arrayList;
                        aVar2 = MultibleAdViewsAdapter.this.f20609b;
                        arrayList = MultibleAdViewsAdapter.this.f20608a;
                        aVar2.b(((AdGeneralModel) arrayList.get(i11)).b());
                    }
                });
            }
        } else if (p02 instanceof c) {
            c cVar = (c) p02;
            MyWebView a14 = cVar.a();
            if (a14 != null) {
                String j11 = this.f20608a.get(i11).j();
                if (j11 != null) {
                    str = j11;
                }
                a14.e(str);
            }
            MyWebView a15 = cVar.a();
            if (a15 != null) {
                a15.setOnClickListener(new b(this, i11));
            }
            MyWebView a16 = cVar.a();
            if (a16 != null) {
                f.b(a16, new g00.a<p>() { // from class: com.forsale.adserver.adviews.slidingBanners.MultibleAdViewsAdapter$onBindViewHolder$4
                    /* JADX INFO: Access modifiers changed from: package-private */
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // g00.a
                    public /* bridge */ /* synthetic */ p invoke() {
                        invoke2();
                        return p.f75480a;
                    }

                    /* renamed from: invoke  reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        a aVar2;
                        ArrayList arrayList;
                        aVar2 = MultibleAdViewsAdapter.this.f20609b;
                        arrayList = MultibleAdViewsAdapter.this.f20608a;
                        aVar2.b(((AdGeneralModel) arrayList.get(i11)).b());
                    }
                });
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup p02, int i11) {
        o.i(p02, "p0");
        if (i11 != -5) {
            if (i11 == -4) {
                View inflate = LayoutInflater.from(p02.getContext()).inflate(g.f62325m, p02, false);
                o.f(inflate);
                return new c(inflate);
            }
            throw new Throwable("Type Not defined");
        }
        View inflate2 = LayoutInflater.from(p02.getContext()).inflate(g.f62324l, p02, false);
        o.f(inflate2);
        return new n8.a(inflate2);
    }
}
