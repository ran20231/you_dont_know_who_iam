package com.forsale.app.ui;

import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.l0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
/* compiled from: StatefulLayout.kt */
/* loaded from: classes3.dex */
public class StatefulLayout extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final Map<Integer, View> f37836a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatefulLayout(Context ctx, AttributeSet attSet) {
        super(ctx, attSet);
        o.i(ctx, "ctx");
        o.i(attSet, "attSet");
        this.f37836a = new LinkedHashMap();
        if (getChildCount() <= 1) {
            setLayoutTransition(new LayoutTransition());
            return;
        }
        String h11 = s.b(StatefulLayout.class).h();
        throw new IllegalStateException("You must have only one child in " + h11);
    }

    private final void a(View view) {
        boolean z11;
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f37836a.values()) {
            if (!o.d((View) obj, view)) {
                arrayList.add(obj);
            }
        }
        ArrayList<View> arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (true) {
            z11 = true;
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (indexOfChild((View) next) == -1) {
                z11 = false;
            }
            if (z11) {
                arrayList2.add(next);
            }
        }
        for (View view2 : arrayList2) {
            removeView(view2);
        }
        if (indexOfChild(view) == -1) {
            z11 = false;
        }
        if (z11) {
            view = null;
        }
        addView(view);
    }

    public final void b(int i11, v9.c actionScanner) {
        o.i(actionScanner, "actionScanner");
        c(i11);
        actionScanner.setStateViewsActions(this);
    }

    public final void c(int i11) {
        boolean z11;
        View view = this.f37836a.get(Integer.valueOf(i11));
        if (view != null) {
            if (indexOfChild(view) != -1) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                view = null;
            }
            if (view != null) {
                a(view);
                return;
            }
            return;
        }
        View inflate = View.inflate(getContext(), i11, null);
        Integer valueOf = Integer.valueOf(i11);
        Map<Integer, View> map = this.f37836a;
        o.f(inflate);
        map.put(valueOf, inflate);
        a(inflate);
    }

    public final void d() {
        List<Pair> A;
        A = l0.A(this.f37836a);
        for (Pair pair : A) {
            removeView((View) pair.d());
            this.f37836a.remove(pair.c());
        }
    }
}
