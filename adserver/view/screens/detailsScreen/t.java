package com.forsale.adserver.view.screens.detailsScreen;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.alexvasilkov.gestures.Settings;
import com.alexvasilkov.gestures.views.GestureImageView;
import com.forsale.adserver.view.screens.detailsScreen.t;
import java.util.ArrayList;
/* compiled from: SliderImagesAdapter.kt */
/* loaded from: classes2.dex */
public final class t extends RecyclerView.Adapter<RecyclerView.d0> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<String> f21387a;

    /* renamed from: b  reason: collision with root package name */
    private final p f21388b;

    /* compiled from: SliderImagesAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class a extends RecyclerView.d0 {

        /* renamed from: a  reason: collision with root package name */
        private final GestureImageView f21389a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(View v11, int i11) {
            super(v11);
            kotlin.jvm.internal.o.i(v11, "v");
            View findViewById = v11.findViewById(i11);
            kotlin.jvm.internal.o.h(findViewById, "findViewById(...)");
            this.f21389a = (GestureImageView) findViewById;
        }

        public final GestureImageView a() {
            return this.f21389a;
        }
    }

    /* compiled from: SliderImagesAdapter.kt */
    /* loaded from: classes2.dex */
    public static final class b implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ RecyclerView.d0 f21390a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ t f21391b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f21392c;

        b(RecyclerView.d0 d0Var, t tVar, int i11) {
            this.f21390a = d0Var;
            this.f21391b = tVar;
            this.f21392c = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean b(t this$0, int i11, View view) {
            kotlin.jvm.internal.o.i(this$0, "this$0");
            p pVar = this$0.f21388b;
            Object obj = this$0.f21387a.get(i11);
            kotlin.jvm.internal.o.h(obj, "get(...)");
            pVar.c((String) obj);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View v11) {
            kotlin.jvm.internal.o.i(v11, "v");
            GestureImageView a11 = ((a) this.f21390a).a();
            final t tVar = this.f21391b;
            final int i11 = this.f21392c;
            a11.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.forsale.adserver.view.screens.detailsScreen.u
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    boolean b11;
                    b11 = t.b.b(t.this, i11, view);
                    return b11;
                }
            });
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View v11) {
            kotlin.jvm.internal.o.i(v11, "v");
            ((a) this.f21390a).a().setOnLongClickListener(null);
        }
    }

    public t(ArrayList<String> images, p onLongPress) {
        kotlin.jvm.internal.o.i(images, "images");
        kotlin.jvm.internal.o.i(onLongPress, "onLongPress");
        this.f21387a = images;
        this.f21388b = onLongPress;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f21387a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 p02, int i11) {
        kotlin.jvm.internal.o.i(p02, "p0");
        if (p02 instanceof a) {
            a aVar = (a) p02;
            m9.b.d(aVar.a(), this.f21387a.get(i11));
            Settings n11 = aVar.a().getController().n();
            n11.N(true);
            n11.L(3.0f);
            aVar.a().addOnAttachStateChangeListener(new b(p02, this, i11));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup p02, int i11) {
        kotlin.jvm.internal.o.i(p02, "p0");
        GestureImageView gestureImageView = new GestureImageView(p02.getContext());
        gestureImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        int generateViewId = View.generateViewId();
        gestureImageView.setId(generateViewId);
        gestureImageView.getController().n().J(Settings.Fit.INSIDE);
        return new a(gestureImageView, generateViewId);
    }
}
