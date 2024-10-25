package com.forsale.app.features.postad.media.imagetutorials.pager;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.core.view.t1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.d0;
import kotlin.collections.s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import m00.i;
import t9.a1;
import t9.o0;
/* compiled from: IndefinitePagerIndicator.kt */
/* loaded from: classes2.dex */
public final class IndefinitePagerIndicator extends View implements ViewPager.j {
    public static final a G = new a(null);
    public static final int H = 8;
    private int A;
    private final Paint B;
    private final Paint C;
    private int D;
    private int E;
    private float F;

    /* renamed from: a  reason: collision with root package name */
    private RecyclerView f35999a;

    /* renamed from: b  reason: collision with root package name */
    private ViewPager f36000b;

    /* renamed from: c  reason: collision with root package name */
    private ViewPager2 f36001c;

    /* renamed from: d  reason: collision with root package name */
    private b f36002d;

    /* renamed from: e  reason: collision with root package name */
    private final DecelerateInterpolator f36003e;

    /* renamed from: f  reason: collision with root package name */
    private int f36004f;

    /* renamed from: g  reason: collision with root package name */
    private int f36005g;

    /* renamed from: h  reason: collision with root package name */
    private int f36006h;

    /* renamed from: i  reason: collision with root package name */
    private int f36007i;

    /* renamed from: j  reason: collision with root package name */
    private int f36008j;

    /* renamed from: x  reason: collision with root package name */
    private boolean f36009x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f36010y;

    /* renamed from: z  reason: collision with root package name */
    private int f36011z;

    /* compiled from: IndefinitePagerIndicator.kt */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(float f11, Resources resources) {
            return (int) (f11 * (resources.getDisplayMetrics().densityDpi / 160));
        }
    }

    /* compiled from: IndefinitePagerIndicator.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.t {

        /* renamed from: a  reason: collision with root package name */
        private View f36012a;

        public b() {
        }

        private final float a(View view) {
            int left = view.getLeft();
            int right = view.getRight();
            int width = view.getWidth();
            if (left >= 0) {
                if (right > IndefinitePagerIndicator.this.getWidth()) {
                    right = IndefinitePagerIndicator.this.getWidth() - left;
                } else {
                    return 1.0f;
                }
            }
            return right / width;
        }

        private final View b() {
            Integer num;
            View view;
            RecyclerView.o layoutManager;
            RecyclerView.o layoutManager2;
            RecyclerView recyclerView = IndefinitePagerIndicator.this.f35999a;
            if (recyclerView != null && (layoutManager2 = recyclerView.getLayoutManager()) != null) {
                num = Integer.valueOf(layoutManager2.i0());
            } else {
                num = null;
            }
            o.f(num);
            float f11 = 0.0f;
            View view2 = null;
            for (int intValue = num.intValue() - 1; -1 < intValue; intValue--) {
                RecyclerView recyclerView2 = IndefinitePagerIndicator.this.f35999a;
                if (recyclerView2 != null && (layoutManager = recyclerView2.getLayoutManager()) != null) {
                    view = layoutManager.h0(intValue);
                } else {
                    view = null;
                }
                if (view != null) {
                    float a11 = a(view);
                    if (a11 >= f11) {
                        view2 = view;
                        f11 = a11;
                    }
                }
            }
            return view2;
        }

        private final void c(View view) {
            Integer num;
            RecyclerView.d0 Y;
            RecyclerView recyclerView = IndefinitePagerIndicator.this.f35999a;
            if (recyclerView != null && (Y = recyclerView.Y(view)) != null) {
                num = Integer.valueOf(Y.getBindingAdapterPosition());
            } else {
                num = null;
            }
            o.f(num);
            IndefinitePagerIndicator indefinitePagerIndicator = IndefinitePagerIndicator.this;
            int intValue = num.intValue();
            if (indefinitePagerIndicator.q() && !indefinitePagerIndicator.f36010y) {
                intValue = indefinitePagerIndicator.o(intValue);
            }
            indefinitePagerIndicator.E = intValue;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.t
        public void onScrolled(RecyclerView recyclerView, int i11, int i12) {
            int w22;
            o.i(recyclerView, "recyclerView");
            View b11 = b();
            if (b11 != null) {
                c(b11);
                IndefinitePagerIndicator.this.F = b11.getLeft() / b11.getMeasuredWidth();
            }
            RecyclerView.o layoutManager = recyclerView.getLayoutManager();
            o.g(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            IndefinitePagerIndicator indefinitePagerIndicator = IndefinitePagerIndicator.this;
            if (i11 >= 0) {
                w22 = linearLayoutManager.z2();
            } else {
                w22 = linearLayoutManager.w2();
            }
            if (this.f36012a != linearLayoutManager.b0(w22)) {
                indefinitePagerIndicator.D = indefinitePagerIndicator.E;
            }
            this.f36012a = b11;
            IndefinitePagerIndicator.this.invalidate();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IndefinitePagerIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        o.i(context, "context");
    }

    private final int getCalculatedWidth() {
        return (((this.f36004f + (this.f36005g * 2)) - 1) * getDistanceBetweenTheCenterOfTwoDots()) + (this.f36007i * 2);
    }

    private final int getDistanceBetweenTheCenterOfTwoDots() {
        return (this.f36007i * 2) + this.f36008j;
    }

    private final int getDotYCoordinate() {
        return this.f36006h;
    }

    private final Integer getPagerItemCount() {
        RecyclerView.Adapter adapter;
        androidx.viewpager.widget.a adapter2;
        RecyclerView.Adapter adapter3;
        RecyclerView recyclerView = this.f35999a;
        if (recyclerView != null) {
            if (recyclerView == null || (adapter3 = recyclerView.getAdapter()) == null) {
                return null;
            }
            return r(adapter3);
        }
        ViewPager viewPager = this.f36000b;
        if (viewPager != null) {
            if (viewPager == null || (adapter2 = viewPager.getAdapter()) == null) {
                return null;
            }
            return Integer.valueOf(adapter2.d());
        }
        ViewPager2 viewPager2 = this.f36001c;
        if (viewPager2 != null) {
            if (viewPager2 == null || (adapter = viewPager2.getAdapter()) == null) {
                return null;
            }
            return r(adapter);
        }
        return 0;
    }

    private final int l(int i11) {
        boolean z11;
        Integer pagerItemCount = getPagerItemCount();
        if (pagerItemCount != null && pagerItemCount.intValue() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            pagerItemCount = null;
        }
        if (pagerItemCount == null) {
            return 0;
        }
        int intValue = pagerItemCount.intValue();
        if (i11 > intValue) {
            i11 %= intValue;
        }
        return i11;
    }

    private final float m(int i11) {
        return ((i11 - this.E) * getDistanceBetweenTheCenterOfTwoDots()) + (getDistanceBetweenTheCenterOfTwoDots() * this.F);
    }

    private final Paint n(float f11) {
        if (Math.abs(f11) < getDistanceBetweenTheCenterOfTwoDots() / 2) {
            return this.B;
        }
        return this.C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int o(int i11) {
        boolean z11;
        Integer pagerItemCount = getPagerItemCount();
        if (pagerItemCount == null) {
            return 0;
        }
        if (pagerItemCount.intValue() != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            pagerItemCount = null;
        }
        if (pagerItemCount == null) {
            return 0;
        }
        return (pagerItemCount.intValue() - l(i11)) - 1;
    }

    private final float p(float f11) {
        int i11;
        float abs = Math.abs(f11);
        float distanceBetweenTheCenterOfTwoDots = (this.f36004f / 2) * getDistanceBetweenTheCenterOfTwoDots();
        if (abs < getDistanceBetweenTheCenterOfTwoDots() / 2) {
            i11 = this.f36006h;
        } else if (abs <= distanceBetweenTheCenterOfTwoDots) {
            i11 = this.f36007i;
        } else {
            return this.f36003e.getInterpolation(1 - ((abs - distanceBetweenTheCenterOfTwoDots) / ((getCalculatedWidth() / 2.01f) - distanceBetweenTheCenterOfTwoDots))) * this.f36007i;
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q() {
        if (t1.B(this) == 1) {
            return true;
        }
        return false;
    }

    private final void s() {
        RecyclerView recyclerView;
        b bVar = this.f36002d;
        if (bVar != null && (recyclerView = this.f35999a) != null) {
            recyclerView.k1(bVar);
        }
        ViewPager viewPager = this.f36000b;
        if (viewPager != null) {
            viewPager.N(this);
        }
        this.f35999a = null;
        this.f36000b = null;
        this.f36001c = null;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void b(int i11) {
        this.E = this.D;
        if (this.f36009x && q()) {
            i11 = o(i11);
        }
        this.D = i11;
        invalidate();
    }

    public final void j(RecyclerView recyclerView) {
        s();
        this.f35999a = recyclerView;
        b bVar = new b();
        this.f36002d = bVar;
        RecyclerView recyclerView2 = this.f35999a;
        if (recyclerView2 != null) {
            recyclerView2.n(bVar);
        }
    }

    public final void k(ViewPager viewPager) {
        int i11;
        s();
        this.f36000b = viewPager;
        if (viewPager != null) {
            viewPager.d(this);
        }
        if (viewPager != null) {
            i11 = viewPager.getCurrentItem();
        } else {
            i11 = 0;
        }
        this.D = l(i11);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        boolean z11;
        i t11;
        int y11;
        float width;
        float dotYCoordinate;
        o.i(canvas, "canvas");
        super.onDraw(canvas);
        Integer pagerItemCount = getPagerItemCount();
        if (pagerItemCount != null && pagerItemCount.intValue() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z11) {
            pagerItemCount = null;
        }
        if (pagerItemCount != null) {
            t11 = m00.o.t(0, pagerItemCount.intValue());
            y11 = s.y(t11, 10);
            ArrayList<Number> arrayList = new ArrayList(y11);
            Iterator<Integer> it2 = t11.iterator();
            while (it2.hasNext()) {
                arrayList.add(Float.valueOf(m(((d0) it2).a())));
            }
            for (Number number : arrayList) {
                float floatValue = number.floatValue();
                if (this.f36010y) {
                    width = getDotYCoordinate();
                    dotYCoordinate = (getHeight() / 2) + floatValue;
                } else {
                    width = (getWidth() / 2) + floatValue;
                    dotYCoordinate = getDotYCoordinate();
                }
                canvas.drawCircle(width, dotYCoordinate, p(floatValue), n(floatValue));
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        int i13 = this.f36006h * 2;
        if (this.f36010y) {
            setMeasuredDimension(i13, getCalculatedWidth());
        } else {
            setMeasuredDimension(getCalculatedWidth(), i13);
        }
    }

    public final Integer r(RecyclerView.Adapter<?> adapter) {
        o.i(adapter, "<this>");
        if (adapter instanceof ua.b) {
            return Integer.valueOf(((ua.b) adapter).c());
        }
        return Integer.valueOf(adapter.getItemCount());
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void z(int i11, float f11, int i12) {
        if (this.f36009x && q()) {
            this.E = o(i11);
            this.F = f11 * 1;
        } else {
            this.E = l(i11);
            this.F = f11 * (-1);
        }
        invalidate();
    }

    public /* synthetic */ IndefinitePagerIndicator(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IndefinitePagerIndicator(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        o.i(context, "context");
        this.f36003e = new DecelerateInterpolator();
        this.f36004f = 5;
        this.f36005g = 1;
        a aVar = G;
        Resources resources = getResources();
        o.h(resources, "getResources(...)");
        this.f36006h = aVar.b(5.5f, resources);
        Resources resources2 = getResources();
        o.h(resources2, "getResources(...)");
        this.f36007i = aVar.b(4.0f, resources2);
        Resources resources3 = getResources();
        o.h(resources3, "getResources(...)");
        this.f36008j = aVar.b(10.0f, resources3);
        this.f36011z = androidx.core.content.b.getColor(getContext(), o0.f69333j);
        this.A = androidx.core.content.b.getColor(getContext(), o0.f69332i);
        Paint paint = new Paint();
        this.B = paint;
        Paint paint2 = new Paint();
        this.C = paint2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a1.f69202a, 0, 0);
            o.h(obtainStyledAttributes, "obtainStyledAttributes(...)");
            this.f36004f = obtainStyledAttributes.getInteger(a1.f69204c, 5);
            this.f36005g = obtainStyledAttributes.getInt(a1.f69207f, 1);
            this.f36007i = obtainStyledAttributes.getDimensionPixelSize(a1.f69205d, this.f36007i);
            this.f36006h = obtainStyledAttributes.getDimensionPixelSize(a1.f69209h, this.f36006h);
            this.f36011z = obtainStyledAttributes.getColor(a1.f69203b, this.f36011z);
            this.A = obtainStyledAttributes.getColor(a1.f69208g, this.A);
            this.f36008j = obtainStyledAttributes.getDimensionPixelSize(a1.f69206e, this.f36008j);
            this.f36009x = obtainStyledAttributes.getBoolean(a1.f69210i, false);
            this.f36010y = obtainStyledAttributes.getBoolean(a1.f69211j, false);
        }
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.A);
        paint.setAntiAlias(true);
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(this.f36011z);
        paint2.setAntiAlias(true);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void M(int i11) {
    }
}
