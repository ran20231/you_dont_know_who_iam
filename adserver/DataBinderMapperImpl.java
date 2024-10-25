package com.forsale.adserver;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.e;
import androidx.databinding.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l8.g;
import t8.b;
import t8.d;
import t8.h;
import t8.j;
import t8.l;
import t8.n;
import t8.p;
import t8.r;
import t8.t;
/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f20531a;

    /* loaded from: classes2.dex */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        static final HashMap<String, Integer> f20532a;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(10);
            f20532a = hashMap;
            hashMap.put("layout/activity_before_details_0", Integer.valueOf(g.f62313a));
            hashMap.put("layout/activity_details_0", Integer.valueOf(g.f62314b));
            hashMap.put("layout/browser_activity_0", Integer.valueOf(g.f62315c));
            hashMap.put("layout/dial_bottom_sheet_0", Integer.valueOf(g.f62316d));
            hashMap.put("layout/fragment_features_0", Integer.valueOf(g.f62319g));
            hashMap.put("layout/fragment_notification_0", Integer.valueOf(g.f62320h));
            hashMap.put("layout/fragment_slider_item_0", Integer.valueOf(g.f62321i));
            hashMap.put("layout/gam_layout_0", Integer.valueOf(g.f62322j));
            hashMap.put("layout/list_item_notification_0", Integer.valueOf(g.f62323k));
            hashMap.put("layout/save_image_sheet_0", Integer.valueOf(g.f62331s));
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(10);
        f20531a = sparseIntArray;
        sparseIntArray.put(g.f62313a, 1);
        sparseIntArray.put(g.f62314b, 2);
        sparseIntArray.put(g.f62315c, 3);
        sparseIntArray.put(g.f62316d, 4);
        sparseIntArray.put(g.f62319g, 5);
        sparseIntArray.put(g.f62320h, 6);
        sparseIntArray.put(g.f62321i, 7);
        sparseIntArray.put(g.f62322j, 8);
        sparseIntArray.put(g.f62323k, 9);
        sparseIntArray.put(g.f62331s, 10);
    }

    @Override // androidx.databinding.e
    public List<e> a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    @Override // androidx.databinding.e
    public ViewDataBinding b(f fVar, View view, int i11) {
        int i12 = f20531a.get(i11);
        if (i12 > 0) {
            Object tag = view.getTag();
            if (tag != null) {
                switch (i12) {
                    case 1:
                        if ("layout/activity_before_details_0".equals(tag)) {
                            return new b(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_before_details is invalid. Received: " + tag);
                    case 2:
                        if ("layout/activity_details_0".equals(tag)) {
                            return new d(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for activity_details is invalid. Received: " + tag);
                    case 3:
                        if ("layout/browser_activity_0".equals(tag)) {
                            return new t8.f(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for browser_activity is invalid. Received: " + tag);
                    case 4:
                        if ("layout/dial_bottom_sheet_0".equals(tag)) {
                            return new h(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for dial_bottom_sheet is invalid. Received: " + tag);
                    case 5:
                        if ("layout/fragment_features_0".equals(tag)) {
                            return new j(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_features is invalid. Received: " + tag);
                    case 6:
                        if ("layout/fragment_notification_0".equals(tag)) {
                            return new l(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_notification is invalid. Received: " + tag);
                    case 7:
                        if ("layout/fragment_slider_item_0".equals(tag)) {
                            return new n(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for fragment_slider_item is invalid. Received: " + tag);
                    case 8:
                        if ("layout/gam_layout_0".equals(tag)) {
                            return new p(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for gam_layout is invalid. Received: " + tag);
                    case 9:
                        if ("layout/list_item_notification_0".equals(tag)) {
                            return new r(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for list_item_notification is invalid. Received: " + tag);
                    case 10:
                        if ("layout/save_image_sheet_0".equals(tag)) {
                            return new t(fVar, view);
                        }
                        throw new IllegalArgumentException("The tag for save_image_sheet is invalid. Received: " + tag);
                    default:
                        return null;
                }
            }
            throw new RuntimeException("view must have a tag");
        }
        return null;
    }

    @Override // androidx.databinding.e
    public ViewDataBinding c(f fVar, View[] viewArr, int i11) {
        if (viewArr == null || viewArr.length == 0 || f20531a.get(i11) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.e
    public int d(String str) {
        Integer num;
        if (str == null || (num = a.f20532a.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }
}
