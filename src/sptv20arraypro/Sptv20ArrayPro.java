/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptv20arraypro;

import java.util.Arrays;


/**
 *
 * @author user
 */
public class Sptv20ArrayPro {

    /**
     * @param args the command line arguments
     */
 public static void main(String[] args) {
        int[]nums;
        nums=new int[5];
        for(int i=0;i<nums.length;i++){
            nums[i]=i+1;}
        System.out.print("nums = [");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            if (i<nums.length-1){ 
            System.out.print(", ");
            }

        }
    System.out.println("]");
    int[] nums2=Arrays.copyOf(nums,7);
    for(int i=0;i<nums.length;i++){nums2[i]=nums[i];}
        System.arraycopy(nums,0,nums2,0,nums.length);
        System.out.println("nums2="+Arrays.toString(nums2));
        nums = nums2;
        System.out.println("nums= "+Arrays.toString(nums));
    }
			
	
    }
     
