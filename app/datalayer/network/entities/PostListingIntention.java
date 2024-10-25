package com.forsale.app.datalayer.network.entities;

import a00.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.i0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import up.c;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PostListingIntention.kt */
/* loaded from: classes2.dex */
public final class PostListingIntention {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ PostListingIntention[] $VALUES;
    public static final Companion Companion;
    private static final Map<String, PostListingIntention> map;
    private final String value;
    @c("")
    public static final PostListingIntention NON = new PostListingIntention("NON", 0, "NON");
    @c("")
    public static final PostListingIntention NEW_LISTING = new PostListingIntention("NEW_LISTING", 1, "NEW_LISTING");
    @c("")
    public static final PostListingIntention FULL_EDIT = new PostListingIntention("FULL_EDIT", 2, "FULL_EDIT");
    @c("")
    public static final PostListingIntention RE_POST = new PostListingIntention("RE_POST", 3, "RE_POST");
    @c("")
    public static final PostListingIntention BOOST = new PostListingIntention("BOOST", 4, "BOOST");
    @c("listing_about_to_expire")
    public static final PostListingIntention BOOST_LISTING_ABOUT_TO_EXPIRE = new PostListingIntention("BOOST_LISTING_ABOUT_TO_EXPIRE", 5, "BOOST_LISTING_ABOUT_TO_EXPIRE");

    /* compiled from: PostListingIntention.kt */
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PostListingIntention from(String type) {
            o.i(type, "type");
            Object obj = PostListingIntention.map.get(type);
            o.f(obj);
            return (PostListingIntention) obj;
        }
    }

    private static final /* synthetic */ PostListingIntention[] $values() {
        return new PostListingIntention[]{NON, NEW_LISTING, FULL_EDIT, RE_POST, BOOST, BOOST_LISTING_ABOUT_TO_EXPIRE};
    }

    static {
        int e11;
        int d11;
        PostListingIntention[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
        Companion = new Companion(null);
        PostListingIntention[] values = values();
        e11 = i0.e(values.length);
        d11 = m00.o.d(e11, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(d11);
        for (PostListingIntention postListingIntention : values) {
            linkedHashMap.put(postListingIntention.value, postListingIntention);
        }
        map = linkedHashMap;
    }

    private PostListingIntention(String str, int i11, String str2) {
        this.value = str2;
    }

    public static a<PostListingIntention> getEntries() {
        return $ENTRIES;
    }

    public static PostListingIntention valueOf(String str) {
        return (PostListingIntention) Enum.valueOf(PostListingIntention.class, str);
    }

    public static PostListingIntention[] values() {
        return (PostListingIntention[]) $VALUES.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
