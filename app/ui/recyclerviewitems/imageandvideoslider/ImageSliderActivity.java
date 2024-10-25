package com.forsale.app.ui.recyclerviewitems.imageandvideoslider;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r;
import com.forsale.app.datalayer.repositories.ImagesRepository;
import com.forsale.app.utils.ContextExtensionsKt;
import com.forsale.app.utils.t;
import com.forsale.app.utils.u;
import g00.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import n00.k;
import t9.t0;
import wz.h;
import wz.p;
/* compiled from: ImageSliderActivity.kt */
/* loaded from: classes3.dex */
public final class ImageSliderActivity extends com.forsale.app.ui.recyclerviewitems.imageandvideoslider.a<aa.g> {

    /* renamed from: h  reason: collision with root package name */
    private final h f39468h;

    /* renamed from: i  reason: collision with root package name */
    private final t f39469i;

    /* renamed from: j  reason: collision with root package name */
    public ImagesRepository f39470j;

    /* renamed from: y  reason: collision with root package name */
    static final /* synthetic */ k<Object>[] f39466y = {s.g(new PropertyReference1Impl(ImageSliderActivity.class, "writePermission", "getWritePermission()Lcom/forsale/app/utils/PermissionsManager;", 0))};

    /* renamed from: x  reason: collision with root package name */
    public static final a f39465x = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f39467z = 8;

    /* compiled from: ImageSliderActivity.kt */
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Context context, List<String> images) {
            o.i(context, "<this>");
            o.i(images, "images");
            Intent intent = new Intent(context, ImageSliderActivity.class);
            ArrayList arrayList = new ArrayList();
            CollectionsKt___CollectionsKt.T0(images, arrayList);
            intent.putExtra("IMAGES_ARRAY", arrayList);
            context.startActivity(intent);
        }
    }

    public ImageSliderActivity() {
        h a11;
        a11 = kotlin.d.a(new g00.a<ArrayList<String>>() { // from class: com.forsale.app.ui.recyclerviewitems.imageandvideoslider.ImageSliderActivity$images$2
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // g00.a
            /* renamed from: b */
            public final ArrayList<String> invoke() {
                return ImageSliderActivity.this.getIntent().getStringArrayListExtra("IMAGES_ARRAY");
            }
        });
        this.f39468h = a11;
        this.f39469i = t.f40536d.a(78, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    private final void A0(ArrayList<String> arrayList) {
        RecyclerView recyclerView = ((aa.g) o0()).O;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setNestedScrollingEnabled(false);
        r rVar = new r();
        recyclerView.setAdapter(new f(new d(arrayList), this));
        rVar.b(recyclerView);
    }

    private final ArrayList<String> x0() {
        return (ArrayList) this.f39468h.getValue();
    }

    private final u y0() {
        return this.f39469i.a(this, f39466y[0]);
    }

    public final void B0(final String imageUrl) {
        o.i(imageUrl, "imageUrl");
        u.g(y0(), null, new g00.a<p>() { // from class: com.forsale.app.ui.recyclerviewitems.imageandvideoslider.ImageSliderActivity$shareImage$1
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
                ContextExtensionsKt.O(ImageSliderActivity.this, imageUrl);
            }
        }, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.ui.recyclerviewitems.imageandvideoslider.a, com.forsale.app.base.activities.BasePlainActivity, androidx.fragment.app.p, androidx.activity.ComponentActivity, androidx.core.app.l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ArrayList<String> x02 = x0();
        if (x02 != null) {
            A0(x02);
        }
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] permissions, int[] grantResults) {
        o.i(permissions, "permissions");
        o.i(grantResults, "grantResults");
        super.onRequestPermissionsResult(i11, permissions, grantResults);
        y0().d(i11, permissions, grantResults, new l<List<? extends String>, p>() { // from class: com.forsale.app.ui.recyclerviewitems.imageandvideoslider.ImageSliderActivity$onRequestPermissionsResult$1
            public final void b(List<String> it2) {
                o.i(it2, "it");
            }

            @Override // g00.l
            public /* bridge */ /* synthetic */ p invoke(List<? extends String> list) {
                b(list);
                return p.f75480a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.forsale.app.base.activities.BasePlainActivity
    public int p0() {
        return t0.f70189d;
    }

    public final ImagesRepository w0() {
        ImagesRepository imagesRepository = this.f39470j;
        if (imagesRepository != null) {
            return imagesRepository;
        }
        o.w("glideRepo");
        return null;
    }

    public final void z0(final String imageUrl) {
        o.i(imageUrl, "imageUrl");
        u.g(y0(), null, new g00.a<p>() { // from class: com.forsale.app.ui.recyclerviewitems.imageandvideoslider.ImageSliderActivity$saveImage$1
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
                ImageSliderActivity imageSliderActivity = ImageSliderActivity.this;
                ContextExtensionsKt.I(imageSliderActivity, imageSliderActivity.w0(), imageUrl);
            }
        }, 1, null);
    }
}
